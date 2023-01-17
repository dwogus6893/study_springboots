// package com.study.yojulab.controller;

// import java.util.ArrayList;
// import java.util.HashMap;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// import com.study.yojulab.beans.BoardBean;
// import com.study.yojulab.service.DataInfors;



// @Controller
// @RequestMapping(value = "/notice")
// public class NoticeController {
//     @RequestMapping(value = {"/","/list"})  
//     public ModelAndView list() {
//         ModelAndView modelAndView = new ModelAndView();
//         DataInfors dataInfors = new DataInfors();
//         ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
//         modelAndView.addObject("boardList", boardList);
//         modelAndView.setViewName("notice/list");
//         return modelAndView;
//     }



//     @RequestMapping(value = "/view}")  
//     public ModelAndView view(@RequestParam HashMap<String, String> params) { 
//         ModelAndView modelAndView = new ModelAndView();
//         params.put("title",params.get("title"));
//         params.put("userName",params.get("userName"));
//         params.put("content",params.get("content"));
//         modelAndView.addObject("params",params);
//         modelAndView.setViewName("/notice/view");
//         return modelAndView;
//     }

    
// }
