package com.example.appMusic.services;

import com.example.appMusic.DTO.UserDTO;
import com.example.appMusic.entities.User;
import com.example.appMusic.mapper.UserToUserDTO;
import com.example.appMusic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserToUserDTO userToUserDTO;
    @Override
    public Optional<User> findUserById(Integer id) {
        return userRepository.findUserByUserId(id);
    }
}
