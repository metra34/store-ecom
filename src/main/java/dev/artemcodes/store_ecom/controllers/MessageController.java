package dev.artemcodes.store_ecom.controllers;

import dev.artemcodes.store_ecom.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/hello")
    public Message sayHello() {
        return new Message("Hello from MessageController");
    }
}
