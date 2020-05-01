package com.jadson.study.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jadson.study.service.TestService;

/**
 * Created on 2020-03-19
 */
@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        return testService.test();
    }
}
