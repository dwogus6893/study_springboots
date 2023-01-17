package com.study.yojulab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.yojulab.dao.CommonCodeDao;

public class CommonCodeController {
    @Autowired
    CommonCodeDao commonCodeDao;

    @RequestMapping(value = "/Common")    
    public void Common(){
        Object result = commonCodeDao.getList();
        int i = 0;
    }
    @RequestMapping(value = "/Common.jsp")    
    public String Commonjsp(){
        int i = 0;
        return "Common";
    }

}
