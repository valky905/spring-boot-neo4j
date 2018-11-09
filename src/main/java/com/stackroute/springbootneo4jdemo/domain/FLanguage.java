package com.stackroute.springbootneo4jdemo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.web.bind.annotation.GetMapping;

@NodeEntity
public class FLanguage {
    @GraphId
    private Long id;
    private String name;

    public FLanguage() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}



public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
}
