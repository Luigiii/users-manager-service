package com.pimentas.usersmanagerservice.controller;

import com.pimentas.usersmanagerservice.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @Override
    public ResponseEntity<Void> createUser(User body) {
        System.out.println("Hello World!");
        return null;
    }

}
