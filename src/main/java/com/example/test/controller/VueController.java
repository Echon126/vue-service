package com.example.test.controller;

import com.example.test.data.VueUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class VueController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login/loginbyemail",method = RequestMethod.POST)
    public VueUser queryUserInfo() {
        this.log.info("调用后台服务" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return new VueUser("Super Admin", "[admin]", "我是超级管理员", "admin", "0001");
    }

}
