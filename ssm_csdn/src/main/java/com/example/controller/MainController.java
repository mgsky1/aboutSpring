package com.example.controller;

import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Huang on 2018/7/1.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/testMVC")
    @ResponseBody
    public Map<String,Object> testMVC(){
        Map<String,Object> responseMap = new HashMap<String,Object>();
        responseMap.put("name","martin");
        return responseMap;
    }

    @RequestMapping("/testSQL")
    @ResponseBody
    public List<Map<String,Object>> testSQL(){
        try
        {
            return  roleService.getAllRoles();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
