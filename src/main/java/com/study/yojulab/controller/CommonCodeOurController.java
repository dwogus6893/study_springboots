package com.study.yojulab.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.yojulab.service.CommonCodeOurService;



@Controller
@RequestMapping(value = "/commonCodeOur")

public class CommonCodeOurController {

    @Autowired
    CommonCodeOurService commonCodeOurService;

    @RequestMapping(value = {"/list","/",""}, method = RequestMethod.GET)
    public ModelAndView list(@RequestParam Map<String, Object> params,ModelAndView modelAndView){
        Object resultMap = commonCodeOurService.getList(params);
        modelAndView.addObject(resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
}
