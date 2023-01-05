package com.study.yojulab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {    
  
    //실습과제
    @RequestMapping(value={"/board", "/board/list"})  // 게시판
    public String list() {
        return "/WEB-INF/views/board/list.jsp";
    }
    @RequestMapping(value="/board/view") //선택 항목 상세보기
    public String view() {
        return "/WEB-INF/views/board/view.jsp";
    }
    @RequestMapping(value="/board/eidt") // 수정
    public String edit() {
        // insert biz
        return "/WEB-INF/views/board/edit.jsp";
    }
    
    @RequestMapping(value="/board/form",method = RequestMethod.GET) // 폼 GET
    public String formGet() {
        return "/WEB-INF/views/board/form.jsp";}  
  

    @RequestMapping(value="/board/form",method = RequestMethod.GET) // 폼 POST
    public String formPost() {
        return "/WEB-INF/views/board/list.jsp";
    }          
}
