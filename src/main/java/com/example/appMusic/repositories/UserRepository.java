package com.example.appMusic.repositories;

import com.example.appMusic.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUserId(Integer id);
    Optional<User> findUserByUsernameAndPasswords(String username, String password);
    @Transactional
    @Modifying
    @Query(value = "insert into users(firstName, lastName, email, username, passwords) value(:firstname, :lastname, :email, :username, :password)", nativeQuery = true)
    void addUser(@Param("firstname") String firstname, @Param("lastname") String lastname, @Param("email") String email, @Param("username") String username, @Param("password") String password);
}
