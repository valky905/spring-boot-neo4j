package com.stackroute.springbootneo4jdemo.controller;

import com.stackroute.springbootneo4jdemo.domain.PL;
import com.stackroute.springbootneo4jdemo.service.PLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/p")

public class PLController {
@Autowired
PLService plService;

@GetMapping
public Collection<PL> getAll(){
    return plService.getAll();
}

}


