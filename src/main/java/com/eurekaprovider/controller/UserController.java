package com.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunlei on 30/01/2018.
 */
@Controller
public class UserController {
    @Value("${server.port}")
    String port;
    @ResponseBody
    @RequestMapping(value = "/name")
    public String getName() {
        return "hello eureka!!!"+port;
    }
}
