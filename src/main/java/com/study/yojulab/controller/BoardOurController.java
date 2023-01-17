package com.study.yojulab.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.yojulab.beans.BoardBean;
import com.study.yojulab.service.DataInfors;

@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController {

    @Autowired
    DataInfors dataInfors;

    @RequestMapping(value = "/edit", method = RequestMethod.POST)  
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("board_our/edit");
        return modelAndView;
    }
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)  
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("firstString", "firstValue");
        //DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);
        
        modelAndView.setViewName("board_our/list");
        return modelAndView;    // --> Dispatcher Servlet
    }

    // localhost:8080/view/U02, localhost:8080/view/U04
    // @RequestMapping(value = "/view", method = RequestMethod.GET)  
    // public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView) {
        // System.out.println("uid : "+uid);
    @RequestMapping(value = "/view/{action_uid}", method = RequestMethod.GET)  
    public ModelAndView view(@PathVariable String action_uid, ModelAndView modelAndView) {
        //DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithBoardBean();
        modelAndView.addObject("boardBean", boardBean);

        modelAndView.setViewName("board_our/view");
        return modelAndView;
    }
    @RequestMapping(value = "/form", method = RequestMethod.GET)    
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("board_our/form");
        return modelAndView;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)    
    // public ModelAndView save(@RequestParam HashMap<String, String> params,  ModelAndView modelAndView) {
    public ModelAndView save(BoardBean boardBean, ModelAndView modelAndView) {
            // insert biz
        modelAndView.setViewName("board_our/list");
        return modelAndView;
    }
}