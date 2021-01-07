package com.qy25.sm.entity.goods;

import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Audit extends BaseEntity<Long> {
    private String auditUserName;

    private Date auditDate;

    private Date auditStartTime;

    private Byte auditResult;

    private String auditIdea;

}