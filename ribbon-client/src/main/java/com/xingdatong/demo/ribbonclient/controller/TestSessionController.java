package com.xingdatong.demo.ribbonclient.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RefreshScope
public class TestSessionController {

    @GetMapping(value = "/set")
    public void setSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("name",123);
    }

    @GetMapping(value = "/get1")
    public Object getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        Object name = session.getAttribute("name");
        System.out.println(name);
        return name;
    }


}
