package com.stackroute.springbootneo4jdemo.controller;


import com.stackroute.springbootneo4jdemo.domain.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/neo4j/t")
public class TopicController {

    @Autowired
    com.stackroute.springbootneo4jdemo.service.topicService topicService;

    @GetMapping
   public List<topic> getAll(){
        return topicService.getAll();
    }
}
