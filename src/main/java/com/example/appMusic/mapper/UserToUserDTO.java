package com.example.appMusic.mapper;

import com.example.appMusic.DTO.UserDTO;
import com.example.appMusic.entities.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class UserToUserDTO implements Function<User, UserDTO> {
    @Override
    public UserDTO apply(User user) {
        return new UserDTO(
                user.getUserId(),
                user.getFirstName() + " " + user.getLastName(),
                user.getPhone(),
                user.getAvatar()
        );
    }
}
