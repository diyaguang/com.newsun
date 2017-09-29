package com.newsun.web.controller;

import com.newsun.web.webEntity.PagePathEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description: com.newsun.web.controller
 * User: diyaguang
 * Date: 2017-09-05 3:57 PM
 */
@Controller
public class HomeController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String Home(Model model){
        model.addAttribute("name","www.newsun.com");
        //页面路径属性
        model.addAttribute("pagePaths",buildPagePath());
        //获取菜单数据

        return "home";
    }

    public List<PagePathEntity> buildPagePath(){
        List<PagePathEntity> pagePath = new ArrayList<>();
        pagePath.add(0,new PagePathEntity("首页","/"));
        pagePath.add(1,new PagePathEntity("我的工作台","/"));
        return pagePath;
    }
}
