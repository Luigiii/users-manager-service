package com.pimentas.usersmanagerservice.controller;

import com.pimentas.usersmanagerservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @Override
    public ResponseEntity<Void> createUser(User user) {
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        System.out.println(user.getType());
        this.kafkaTemplate.send("ecommerce.compras", user.toString());
        return null;
    }

}
