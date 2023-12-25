package com.example.appMusic.controllers;

import com.example.appMusic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "register")
public class RegisterController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<?> register(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam String username, @RequestParam String password){
        userService.addUser(firstname, lastname, email, username, password);
        return ResponseEntity.status(HttpStatus.CREATED).body("register successful!");
    }
}
