package com.chensanwa.springboot.service;

import com.chensanwa.springboot.entity.Area;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/18
 * Time: 13:17
 */
public interface IAreaService {

    /**
     * 获取区域列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据ID获取区域信息
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
