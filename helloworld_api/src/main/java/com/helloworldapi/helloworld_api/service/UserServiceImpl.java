package com.helloworldapi.helloworld_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.helloworldapi.helloworld_api.Entity.User;
import com.helloworldapi.helloworld_api.repository.UserRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public List<User> getListOfUsers(){
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
        
    }
}
