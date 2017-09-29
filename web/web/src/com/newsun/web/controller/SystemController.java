package com.newsun.web.controller;

import com.newsun.web.entity.FunctionsEntity;
import com.newsun.web.service.FunctionsService;
import com.newsun.web.webEntity.PagePathEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: diyaguang
 * @date: 2017/09/23 下午3:17
 * @description: com.newsun.web.controller
 */
@Controller
@RequestMapping(value = "/system")
public class SystemController {

    @Autowired
    FunctionsService functionsService;

    @RequestMapping(value="/functions",method = RequestMethod.GET)
    public String Functions(Model model){
        //页面路径属性
        model.addAttribute("pagePaths",buildPagePath());
        //页面功能按钮绑定
        //页面数据列表绑定
        List<FunctionsEntity> functionsEntityList = functionsService.getAllFunctions();
        model.addAttribute("functionsList",functionsEntityList);
        return "functions";
    }

    @RequestMapping(value = "/functionsAdd",method = RequestMethod.GET)
    public String FunctionsAdd(Model model){
        return "functionsAdd";
    }


    //-----页面方法-----------------------------------------------------------------------------------

    public List<PagePathEntity> buildPagePath(){
        List<PagePathEntity> pagePath = new ArrayList<>();
        pagePath.add(0,new PagePathEntity("首页","/"));
        pagePath.add(1,new PagePathEntity("系统管理","/system"));
        pagePath.add(2,new PagePathEntity("功能管理","/system/functions"));
        return pagePath;
    }
}
