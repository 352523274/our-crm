package com.qy25.sm.entity.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity<T> {
    private T id;
    private Long creatorId;
    private Long updateId;
    private Date addTime;
    private Date updateTime;
    public void setData(){
        if (this.id==null){
            //是添加
            this.addTime=new Date();
            this.creatorId=5L;
        }else {
            //是修改
            this.updateId=2L;
            this.updateTime=new Date();
        }
    }
}
