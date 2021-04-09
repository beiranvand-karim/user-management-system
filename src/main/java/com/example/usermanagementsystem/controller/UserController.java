package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.model.UserModel;
import com.example.usermanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<UserModel> getUserById(@PathVariable String id) {
        return userRepository.findById(Long.valueOf(id));
    }

    @PostMapping(value = "/users")
    public UserModel addUser(@RequestBody UserModel user) {

        Date date = new Date();

        String creationTime = date.toString();
        UserModel userModel = new UserModel(
                user.getFirstName(),
                user.getLastName(),
                creationTime,
                user.getEmailAddress());

        userRepository.save(userModel);
        return userModel;
    }

    @DeleteMapping("/users")
    public Optional<UserModel> deleteUser(@RequestParam String id) {
        Optional<UserModel> userModel = userRepository.findById(Long.valueOf(id));
        userRepository.deleteById(Long.parseLong(id));
        return userModel;
    }

}
