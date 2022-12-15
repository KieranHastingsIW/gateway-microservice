package com.helloworldapi.helloworld_api.service;

import java.util.List;

import com.helloworldapi.helloworld_api.Entity.User;

public interface UserService {
    List<User> getListOfUsers();
    void saveUser( User user);
}
