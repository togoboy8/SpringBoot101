package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class NewHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewHelloWorldApplication.class, args);
    }
        @Controller
        public class HomeController {
            @RequestMapping("/")
            public String homePage(){
                return "index";
            }


        }

}
