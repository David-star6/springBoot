package com.example.bilibili;

import com.example.bilibili.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BilibiliApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean( "helloService");
        logger.trace("trace"+'-'+"trah");
        logger.trace("trace:{}","trah");
        logger.debug("debug:{}",b);
        logger.info("${b}");
        logger.warn("wran");
        logger.error("error");

    }


    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
