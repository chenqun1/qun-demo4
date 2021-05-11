package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 标注主程序类，表示为一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //启动springboot应用
        SpringApplication.run(MainApplication.class,args);
    }
}
