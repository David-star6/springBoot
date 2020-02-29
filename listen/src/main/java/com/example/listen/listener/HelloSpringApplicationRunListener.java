package com.example.listen.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

        public HelloSpringApplicationRunListener(SpringApplication application, String[] args){

        }

        @Override
        public void started(ConfigurableApplicationContext context) {
            System.out.print("SpringApplicationRunListener.....starting....\n");
        }

        @Override
        public void environmentPrepared(ConfigurableEnvironment environment) {

        }

        @Override
        public void contextPrepared(ConfigurableApplicationContext context) {
        }

        @Override
        public void contextLoaded(ConfigurableApplicationContext context) {
        }

        @Override
        public void running(ConfigurableApplicationContext context) {
        }

        @Override
        public void failed(ConfigurableApplicationContext context, Throwable exception) {
        }

}
