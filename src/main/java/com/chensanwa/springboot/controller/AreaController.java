package com.chensanwa.springboot.controller;

import com.chensanwa.springboot.entity.Area;
import com.chensanwa.springboot.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/18
 * Time: 13:43
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Autowired
    private IAreaService areaService;

    @GetMapping(value = "/listarea")
    public Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> areaList = areaService.getAreaList();
        modelMap.put("areaList", areaList);
        return modelMap;
    }

    @GetMapping(value = "getareabyid")
    public Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object> modelMap = new HashMap<>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }

    @PostMapping(value = "/addarea")
    public Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

    @PostMapping(value = "/modifyarea")
    public Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }

    @GetMapping(value = "/deletearea")
    public Map<String,Object> deleteArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }
}
