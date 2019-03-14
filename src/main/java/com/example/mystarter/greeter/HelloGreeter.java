package com.example.mystarter.greeter;

import com.example.mystarter.conf.GreeterProperties;
import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class HelloGreeter implements Greeter {

    GreeterProperties greeterProperties;

    @Override
    public void say() {
        String message = greeterProperties != null && !StringUtils.isEmpty(greeterProperties.getMessage())
                ? greeterProperties.getMessage()
                : "HELLO_WORLD";
        System.out.println(message);
    }
}
