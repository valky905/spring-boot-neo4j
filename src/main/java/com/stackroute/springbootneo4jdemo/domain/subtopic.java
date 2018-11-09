package com.stackroute.springbootneo4jdemo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class subtopic {
@GraphId
private Long id;
private String name;
private Long pid;

public subtopic() {
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

public Long getPid() {
    return pid;
}

public void setPid(Long pid) {
    this.pid = pid;
}
}
