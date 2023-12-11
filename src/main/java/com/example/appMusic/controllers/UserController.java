package com.example.appMusic.controllers;

import com.example.appMusic.DTO.UserDTO;
import com.example.appMusic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public UserDTO findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }
}
