package com.study.yojulab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
    @RequestMapping(value="/board/form",method = RequestMethod.GET) //외부랑 맵핑하기위해
        public String form() {
            return "/WEB-INF/views/board/form.jsp";
    }    
    @RequestMapping(value="/board/form", method = RequestMethod.POST) //
        public String formPost() {
            // insert biz
            return "/WEB-INF/views/board/list.jsp";
    }
    @RequestMapping(value="/board",method = RequestMethod.GET) 
    public String form1() {
        return "/WEB-INF/views/board/form.jsp";
}    
}
