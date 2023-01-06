package com.study.yojulab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //servlets
public class HomeController {
    @RequestMapping(value = {"","/","/main"}) //RequestMapping은 function이다.
    public String main() {
        int i = 0;
        return "main"; 
    } 

    @RequestMapping(value = "/home") //외부에서 들어오는 url , http://localhost:8080/homejsp
    public void home() {
        int i = 0;    
    } 

   @RequestMapping(value = "/homejsp") //외부에서 들어오는 url , http://localhost:8080/homejsp
    public String homejsp() {
        int i = 0;
        return "home"; //spring한테 전달하고, view한테 다시 보여줌
    }

    @RequestMapping(value = "/homehtml") //외부에서 들어오는 url , http://localhost:8080/homejsp
    public String homehtml() {
        int i = 0;
        return "home.html"; //spring한테 전달하고, view한테 다시 보여줌
    }  
}

