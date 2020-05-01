package com.jadson.study.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.jadson.study.service.TestService;

/**
 * Created on 2020-03-19
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "sucess";
    }
}
