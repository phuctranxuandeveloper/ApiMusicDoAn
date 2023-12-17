package com.example.appMusic.controllers;

import com.example.appMusic.DTO.UserDTO;
import com.example.appMusic.entities.User;
import com.example.appMusic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "id/{id}")
    public ResponseEntity<?> findUserById(@PathVariable Integer id){
        User user = userService.findUserById(id).orElse(null);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
