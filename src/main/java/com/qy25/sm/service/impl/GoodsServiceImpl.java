package com.qy25.sm.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy25.sm.common.utils.MyBeanUtils;
import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.Category;
import com.qy25.sm.entity.CategoryExample;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.entity.goods.GoodsExample;
import com.qy25.sm.entity.goods.Goodscolor;
import com.qy25.sm.mapper.BrandMapper;
import com.qy25.sm.mapper.CategoryMapper;
import com.qy25.sm.mapper.GoodsMapper;
import com.qy25.sm.mapper.GoodscolorMapper;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.GoodsService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import com.qy25.sm.vo.GoodsVo;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods, Long> implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private GoodscolorMapper goodscolorMapper;

    /**
     * 分页条件查询
     * @param goodsSearchPageDto
     * @return
     */
    @Override
    public PageVo<GoodsVo> getPageWithExample(int currentPage,int pageSize,GoodsSearchPageDto goodsSearchPageDto) {

        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
//        品牌查询
        if (goodsSearchPageDto.getGoodsBrandId()!= null&&goodsSearchPageDto.getGoodsBrandId() != -1) {
            criteria.andGoodsBrandIdEqualTo(goodsSearchPageDto.getGoodsBrandId());
        }
//        类型查询  如果是大类   包含大类下的所有小类
        if (goodsSearchPageDto.getGoodsCategoryId()!= null&&goodsSearchPageDto.getGoodsCategoryId() != -1) {
            List<Category> lowestCategory = getLowestCategory(goodsSearchPageDto.getGoodsCategoryId());
            ArrayList<Long> longs = new ArrayList<>();
            lowestCategory.forEach(a->{
                longs.add(a.getId());
            });
            criteria.andGoodsCatagoryIdIn(longs);
        }
//        颜色查询
        if (goodsSearchPageDto.getGoodsColorId() !=null&&goodsSearchPageDto.getGoodsColorId() != -1) {
            criteria.andGoodsColorIdEqualTo(goodsSearchPageDto.getGoodsColorId());
        }
//        型号模糊查询
        if (!StringUtils.isEmpty(goodsSearchPageDto.getGoodsModel())) {
            criteria.andGoodsModelLike("%" + goodsSearchPageDto.getGoodsModel() + "%");
        }
//       商品名字模糊查询
        if (!StringUtils.isEmpty(goodsSearchPageDto.getGoodsName())) {
            criteria.andGoodsNameLike("%" + goodsSearchPageDto.getGoodsName() + "%");
        }

        PageHelper.startPage(currentPage,pageSize);
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);

        PageInfo<Goods> pageInfo=new PageInfo<Goods>(goods);

        long total = pageInfo.getTotal();
        List<GoodsVo> goodsVo = getGoodsVo(goods);
        PageVo<GoodsVo> tPageVo = new PageVo<>();
        tPageVo.setList(goodsVo);
        tPageVo.setTotal(total);
        return tPageVo;

    }

    /**
     * 查询全部颜色
     * @return
     */
    @Override
    public List<Goodscolor> findAllColor() {
        return goodscolorMapper.selectByExample(null);
    }

    /**
     *根据id查询goodsvo
     */
    @Override
    public GoodsVo findGoodsVoById(long id) {
        Goods byId = super.findById(id);
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(byId);
        List<GoodsVo> goodsVo = getGoodsVo(goods);
        return goodsVo.get(0);
    }

    /**
     * 获取GoodsVo
     */
    private List<GoodsVo> getGoodsVo(List<Goods> goods) {
        List<GoodsVo> goodsVos = MyBeanUtils.copyListProperties(goods, GoodsVo::new, (goodss, goodsVo) -> {
            // 回调处理
            //给goodsCatagory赋值
            goodsVo.setGoodsCatagory(categoryMapper.selectByPrimaryKey(goodss.getGoodsCatagoryId()).getCategoryName());
            //给goodsBrand赋值
            goodsVo.setGoodsBrand(brandMapper.selectByPrimaryKey(goodss.getGoodsBrandId()).getBrandName());
            //给goodsColor赋值
            goodsVo.setGoodsColor(goodscolorMapper.selectByPrimaryKey(goodss.getGoodsColorId()).getColor());
        });
        System.out.println(goodsVos);
        return goodsVos;

    }



    /**
     * 传入分类id  获取所有最下级类的id集合
     */
    public List<Category> getLowestCategory(Long id){

        System.out.println("id========================"+id);
        Category category = categoryMapper.selectByPrimaryKey(id);
        System.out.println("cccccccccc"+category);
        //new 出最终需要返回的集合
        ArrayList<Category> reCategories = new ArrayList<>();
        //如果不是父类  直接返回
        if (!category.getIsParent()){
            reCategories.add(category);
            return reCategories;
        }
        //如果是父类,
        List<Category> nextCategory = getNextCategory(id,reCategories);
        //1.找下一级
        return reCategories;
    }

    /**
     *返回其下级子类的集合   并将其中没有子类的类添加到最终集合中
     */
    private List<Category> getNextCategory(Long id,List<Category> reList){
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        //找到其所有下级子类
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        if (categories.size()>0){
            categories.forEach(n->{
                if (n.getIsParent()){
                    //如果是父类
                    getNextCategory(n.getId(),reList);
                }else {
                    reList.add(n);
                }
            });
        }
       return reList;
    }
    
}
