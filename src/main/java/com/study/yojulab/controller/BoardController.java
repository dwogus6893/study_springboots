package com.study.yojulab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
//@RequestMapping(value = "/board") //들어오는곳만 영향
public class BoardController {    
  
    //실습과제
//    @RequestMapping(value={"/board","/board/list"})  // 게시판
    public String list() {
        return "board/list"; // 나가는것만 영향
    }
 //   @RequestMapping(value="/board/view") //선택 항목 상세보기
    public String view() {
        return "board/view";
    }
//    @RequestMapping(value="/board/edit") // 수정
    public String edit() {
        // insert biz
        return "board/edit";
    }
    
 //   @RequestMapping(value="/board/form",method = RequestMethod.GET) // 폼 GET
    public String formGet() {
        return "board/form";}  
  

 //   @RequestMapping(value="/board/form",method = RequestMethod.POST) // 폼 POST
    public String formPost() {
        return "board/list";
    }          
}
