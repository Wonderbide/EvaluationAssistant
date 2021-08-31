package com.example.evaluationmaker.controller;

import com.example.evaluationmaker.entity.User;
import com.example.evaluationmaker.repository.UserRepository;
import com.example.evaluationmaker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController("/account/user/")
public class UserController {
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public void creatUser(@RequestBody User newUser){
        userService.save(newUser);
    }

    @GetMapping
    public Set<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
