package com.study.yojulab.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.yojulab.beans.BoardBean;
import com.study.yojulab.service.DataInfors;

@Controller //클라이언트의 요청을 처리한 뒤, 결과를 DispatherServlet에게 리턴
@RequestMapping(value = "/board") //들어오는곳만 영향
    public class BoardController { 
        @RequestMapping(value = "/form", method = {RequestMethod.GET, RequestMethod.POST}) // /board/edit로 됨
        public ModelAndView form(ModelAndView modelAndView) {    
        modelAndView.setViewName("board/form");
        return modelAndView;
}

@RequestMapping(value = {"/", "/list"}, method = {RequestMethod.GET, RequestMethod.POST})
public ModelAndView list(ModelAndView modelAndView) {
    DataInfors dataInfors = new DataInfors();
    ArrayList<BoardBean> boardList = dataInfors.getDataListForBoard();
    modelAndView.addObject("boardList","boardList");

    modelAndView.setViewName("board/list");
    return modelAndView;
}

@RequestMapping(value = "/view", method = {RequestMethod.GET, RequestMethod.POST})
public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView) {
    DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataForBoardBean(uid);
    modelAndView.addObject("boardBean",boardBean);
    modelAndView.setViewName("board/view");
    return modelAndView;
}

@RequestMapping(value = "/edit", method = { RequestMethod.GET, RequestMethod.POST })
public ModelAndView edit(@RequestParam String uid, ModelAndView modelAndView) {
    DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataForBoardBean(uid);
    modelAndView.addObject("boardBean", boardBean);
    modelAndView.setViewName("board/edit");
    return modelAndView;
    }
}