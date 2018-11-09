package com.stackroute.springbootneo4jdemo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class topic {
    @GraphId
private Long id;
    private String name;


    @Relationship(type="subconceptof",direction = Relationship.INCOMING)
   private List <subtopic> subtopics;
    public List<subtopic>getSubtopics(){
        return subtopics;
    }

public topic() {
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

//public Long getPid() {
//    return pid;
//}
//
//public void setPid(Long pid) {
//    this.pid = pid;
//}
}

