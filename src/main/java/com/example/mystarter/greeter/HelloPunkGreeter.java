package com.example.mystarter.greeter;

import lombok.Data;

@Data
public class HelloPunkGreeter implements Greeter {

    @Override
    public void say() {
        System.out.println("Hi man, give me more beer!");
    }
}
