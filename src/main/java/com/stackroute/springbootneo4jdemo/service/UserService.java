package com.stackroute.springbootneo4jdemo.service;

import com.stackroute.springbootneo4jdemo.domain.User;
import com.stackroute.springbootneo4jdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    @Autowired
UserRepository userRepository;

public List<User> getAll(){
    return userRepository.getAllUsers();
}


}
