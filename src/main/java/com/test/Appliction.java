package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Appliction {
	public static void main(String[] args) {
    	System.out.println("test----------------");
        SpringApplication.run(Appliction.class, args);
        System.out.println("test----------------");
    }
}
