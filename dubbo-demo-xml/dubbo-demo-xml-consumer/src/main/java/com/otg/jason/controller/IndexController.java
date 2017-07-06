package com.otg.jason.controller;

import com.otg.jason.service.JasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jason.guan on 2017/7/3.
 */
@Controller
public class IndexController {
    @Autowired
    private JasonService jasonService;

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public @ResponseBody
    String findServer(){
        return jasonService.getUserInfo();
    }
}
