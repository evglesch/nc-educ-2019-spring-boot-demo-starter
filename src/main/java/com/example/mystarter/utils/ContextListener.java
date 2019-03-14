package com.example.mystarter.utils;

import com.example.mystarter.greeter.Greeter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Slf4j
public class ContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired(required = false)
    Greeter greeter;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            greeter.say();
        } catch (NullPointerException e) {
            log.error(e.getMessage());
        }
    }
}
