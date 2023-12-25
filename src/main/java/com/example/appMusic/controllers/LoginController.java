package com.example.appMusic.controllers;

import com.example.appMusic.entities.User;
import com.example.appMusic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "login")
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password){
        User user = userService.findUserByUsernameAndPassword(username, password).orElse(null);
        if (user != null){
            return ResponseEntity.status(HttpStatus.OK).body(Integer.toString(user.getUserId()));
        }
        else return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Login fail!");
    }
}
