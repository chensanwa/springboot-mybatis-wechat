package com.chensanwa.springboot.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/18
 * Time: 11:46
 */
@Data
public class Area {

    private Integer areaId;

    private String areaName;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

}
