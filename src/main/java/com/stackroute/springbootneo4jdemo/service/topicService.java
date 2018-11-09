package com.stackroute.springbootneo4jdemo.service;


import com.stackroute.springbootneo4jdemo.domain.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class topicService {
    @Autowired
    com.stackroute.springbootneo4jdemo.repository.topicRepository topicRepository;
    public List<topic> getAll(){
        return topicRepository.getAlltopics();
    }
}
