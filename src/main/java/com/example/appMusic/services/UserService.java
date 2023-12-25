package com.example.appMusic.services;

import com.example.appMusic.DTO.UserDTO;
import com.example.appMusic.entities.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserById(Integer id);
    Optional<User> findUserByUsernameAndPassword(String username, String password);
    void addUser(String firstname, String lastname, String email, String username, String password);
}
