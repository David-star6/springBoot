package com.example.bilibili.utlis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtli {

    public static void trace(Class<?> clazz ,String str){
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.trace(str);
    }
}
