package com.chensanwa.springboot.dao;

import com.chensanwa.springboot.entity.Area;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/18
 * Time: 11:45
 */
public interface IAreaDao {

    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据ID列出具体区域
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param areaId
     */
    int deleteArea(int areaId);
}
