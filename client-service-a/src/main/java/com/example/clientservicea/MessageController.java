package com.example.clientservicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Value("${custom.message:Default Message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }

}
