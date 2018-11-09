package com.stackroute.springbootneo4jdemo.service;

import com.stackroute.springbootneo4jdemo.domain.User;
import com.stackroute.springbootneo4jdemo.domain.UserPost;
import com.stackroute.springbootneo4jdemo.repository.UserPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPostService {
@Autowired
UserPostRepository userPostRepository;

public List<User> getAll(){
    return userPostRepository.getAllUsers();
}
}
