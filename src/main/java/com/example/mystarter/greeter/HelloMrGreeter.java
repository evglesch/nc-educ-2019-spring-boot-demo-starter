package com.example.mystarter.greeter;

import lombok.Data;

@Data
public class HelloMrGreeter implements Greeter {

    @Override
    public void say() {
        System.out.println("Hello sir, where is my tea?");
    }
}
