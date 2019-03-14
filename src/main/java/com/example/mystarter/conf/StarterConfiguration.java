package com.example.mystarter.conf;

import com.example.mystarter.greeter.Greeter;
import com.example.mystarter.greeter.HelloMrGreeter;
import com.example.mystarter.greeter.HelloPunkGreeter;
import com.example.mystarter.utils.ContextListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(GreeterProperties.class)
public class StarterConfiguration {

    @Autowired
    GreeterProperties greeterProperties;

    @Bean
    public ContextListener contextListener() {
        return new ContextListener();
    }

    @Bean
    @Profile("tea")
    public Greeter helloMrGreeter() {
        return new HelloMrGreeter();
    }

    @Bean
    @Profile("beer")
    public Greeter helloPunkGreeter() {
        return new HelloPunkGreeter();
    }


}
