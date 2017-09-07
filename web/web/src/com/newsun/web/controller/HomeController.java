package com.newsun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "home";
    }
}
