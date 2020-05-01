package com.jadson.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("local")
class SpringBootDubboNacosProviderApplicationTests {


    @Value("${config.user}")
//    @NacosValue(value = "${config.user}", autoRefreshed = true)
    private String userName;

    @Test
    void contextLoads() {
        System.out.println("-----------------"+userName);
    }

}
