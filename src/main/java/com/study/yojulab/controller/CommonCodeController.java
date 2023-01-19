package com.study.yojulab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.yojulab.dao.CommonCodeDao;

@Controller //프리젠테이션 레이어, 웹 애플리케이션에서 View에서 전달된 웹 요청과 응답을 처리하는 클래스
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

    @Autowired //@Autowired는 필드 변수, setter 메소드, 생성자, 일반 메소드에 적용 가능하다.
    CommonCodeDao commonCodeDao;

    @RequestMapping(value="/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        Object list = commonCodeDao.getList();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("/commonCode/list");
    
        return modelAndView;
    }
}
