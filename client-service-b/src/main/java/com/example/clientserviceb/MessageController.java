package com.example.clientserviceb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MessageController {

    @Value("${custom.message:Default Message}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(MessageController.class, args);
    }

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }

}
