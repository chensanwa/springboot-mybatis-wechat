package com.chensanwa.springboot.dao;

import com.chensanwa.springboot.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/18
 * Time: 12:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IAreaDaoTest {

    @Autowired
    private IAreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }


    @Test
    @Ignore
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(3);
        int effectedColumn = areaDao.insertArea(area);
        assertEquals(1,effectedColumn);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaId(3);
        area.setAreaName("北苑");
        area.setLastEditTime(new Date());
        int effectedColumn = areaDao.updateArea(area);
        assertEquals(1,effectedColumn);

    }

    @Test
    @Ignore
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(3);
        assertEquals(1,effectedNum);
    }
}