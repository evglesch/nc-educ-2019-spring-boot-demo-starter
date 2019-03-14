package com.example.mystarter.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "greeter")
public class GreeterProperties {
    String message;
}
