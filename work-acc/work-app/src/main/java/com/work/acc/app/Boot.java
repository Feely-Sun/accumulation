package com.work.acc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

/**
 * @author sunzihan
 * @version $Id: Boot.java V 0.1 11/29/16 20:49 sunzihan EXP $
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Boot {

    public static void main(String[] args) {
        SpringApplication.run(Boot.class,args);
    }
}

