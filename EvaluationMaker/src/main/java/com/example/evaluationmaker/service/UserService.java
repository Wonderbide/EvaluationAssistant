package com.example.evaluationmaker.service;

import com.example.evaluationmaker.entity.User;
import com.example.evaluationmaker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    void saveUser (User user){
    }

    public void save(User newUser) {
        userRepository.save(newUser);
    }

    public Set<User> getAllUsers() {
        return userRepository.findAll();
    }
}
