package com.taotao.controller;

/**
 * 测试用的controller，查询当前时间
 */

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/test/queryNow")
    @ResponseBody
    public String queryNow(){
        //1引入服务
        //2注入服务
        //3调用服务的方法

        return testService.queryNow();
    }
}
