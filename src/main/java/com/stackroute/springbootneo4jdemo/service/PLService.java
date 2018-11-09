package com.stackroute.springbootneo4jdemo.service;

import com.stackroute.springbootneo4jdemo.domain.PL;
import com.stackroute.springbootneo4jdemo.repository.PLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class PLService {
@Autowired
PLRepository plRepository;

public Collection<PL> getAll(){
    return plRepository.getAllPrograms();
}
}
