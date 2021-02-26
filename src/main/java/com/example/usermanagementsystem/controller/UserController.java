package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.model.UserModel;
import com.example.usermanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/getusers")
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getuser")
    public Optional<UserModel> getUserById(@RequestParam String id) {
        return userRepository.findById(id);
    }

    @PostMapping(value = "/adduser")
    public void addUser(@RequestParam String id, @RequestParam String name, @RequestParam String dataCreated, @RequestParam String emailAddress) {
        UserModel userModel = new UserModel(id, name, dataCreated, emailAddress);
        userRepository.save(userModel);
    }

    @DeleteMapping("/deleteuser")
    public void deleteUser(@RequestParam String id) {
        userRepository.deleteById(id);
    }

}
