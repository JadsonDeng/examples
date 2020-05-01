package com.jadson.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2020-03-19
 */
@RestController
public class TestController {

    @Value(("${config.user}"))
    private String configName;

    @GetMapping("/test")
    public String test(){
        return configName;
    }
}
