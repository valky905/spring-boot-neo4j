package com.stackroute.springbootneo4jdemo.controller;

import com.stackroute.springbootneo4jdemo.domain.User;
import com.stackroute.springbootneo4jdemo.domain.UserPost;
import com.stackroute.springbootneo4jdemo.service.UserPostService;
import com.stackroute.springbootneo4jdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/neo4j/userpost")
public class UserControllerPost {
@Autowired
UserPostService userPostService;

@GetMapping
public List<User> getAll(){
    return userPostService.getAll();
}
}
