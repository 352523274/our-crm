package com.qy25.sm.common.utils;

import cn.hutool.core.bean.BeanUtil;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MyBeanUtils extends BeanUtils {
  public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target) {
    return copyListProperties(sources, target, null);
  }
  public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target, ColaBeanUtilsCallBack<S, T> callBack) {
    List<T> list = new ArrayList<>(sources.size());
    for (S source : sources) {
      T t = target.get();
      copyProperties(source, t);
      list.add(t);
      if (callBack != null) {
        // 回调
        callBack.callBack(source, t);
      }
    }
    return list;
  }
}
