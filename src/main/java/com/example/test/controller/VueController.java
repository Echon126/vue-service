package com.example.test.controller;

import com.example.test.data.Repository;
import com.example.test.data.TableData;
import com.example.test.data.VueUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class VueController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login/loginbyemail", method = RequestMethod.POST)
    public VueUser queryUserInfo() {
        this.log.info("调用后台服务" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return new VueUser("Super Admin", "[admin]", "我是超级管理员", "admin", "0001");
    }

    @GetMapping(value = "/tables/table")
    public List<TableData> queryTables() {
        this.log.info("加载基本表格数据 " + new SimpleDateFormat("yyyy-MM-dd").format(new Date(0)));
        return Repository.tableData;
    }

    @GetMapping(value = "/tables/defineTable")
    public List<TableData> queryDefineTables(@RequestParam("name") String name,
                                             @RequestParam("sex") String sex,
                                             @RequestParam("age") int age) {
        this.log.info("加载自定义表格数据 " + new SimpleDateFormat("yyyy-MM-dd").format(new Date(0)));
        return Repository.queryTableData(age);
    }

}
