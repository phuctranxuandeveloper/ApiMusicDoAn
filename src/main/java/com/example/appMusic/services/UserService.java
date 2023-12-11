package com.example.appMusic.services;

import com.example.appMusic.DTO.UserDTO;

public interface UserService {
    UserDTO findUserById(Integer id);
}
