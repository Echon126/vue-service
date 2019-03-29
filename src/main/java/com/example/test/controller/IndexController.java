package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author admin
 * @date 2018-9-4 15:49
 */
@RestController
public class IndexController {

    @RequestMapping(value="/redirect/page")
    public ModelAndView doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String proxyUrl=  request.getParameter("proxyUrl");
        //String redirect= new String( Base64Utils.decode(proxyUrl.getBytes()));
        //TODO 重定向
        //response.sendRedirect("/user/info");
        //TODO 请求转发
       // request.getRequestDispatcher("/user/info").forward(request,response);
        ModelAndView d = new ModelAndView();
        d.setViewName("redirect:http://localhost:8081");
       return d;
        //
        //return  new ModelAndView(new RedirectView("http://localhost:8081"));
    }


    @RequestMapping(value="/user/info")
    public String getName(){
        return "zhangsan";
    }
}
