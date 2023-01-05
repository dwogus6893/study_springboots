package com.study.yojulab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {    
  
    //실습과제
    @RequestMapping(value="/board",method = RequestMethod.GET)  //메인
    public String boardmain() {
        return "/WEB-INF/views/board/list.jsp";
    }
    @RequestMapping(value="/board/view",method = RequestMethod.GET) //선택 항목 상세보기
    public String boardview() {
        return "/WEB-INF/views/board/view.jsp";
    }
    @RequestMapping(value="/board/eidt",method = RequestMethod.GET) // 수정
    public String boardedit() {
        return "/WEB-INF/views/board/edit.jsp";
    }
    @RequestMapping(value="/board/list",method = RequestMethod.GET) // 게시판
    public String boardlist() {
        return "/WEB-INF/views/board/list.jsp";
    }
    @RequestMapping(value="/board/form",method = RequestMethod.GET) // 폼
    public String form() {
        return "/WEB-INF/views/board/form.jsp";}   
    @RequestMapping(value="/board/form",method = RequestMethod.GET) // 폼
    public String formPost() {
        return "/WEB-INF/views/board/form.jsp";}   

    @RequestMapping(value="/board/formwithPost",method = RequestMethod.GET) // 폼제출
    public String boardformwithPost() {
        return "/WEB-INF/views/board/formwithPost.jsp";
    }          
}
