package com.stackroute.springbootneo4jdemo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

public class UserPost {
@GraphId
private Long id;
private String name;

@Relationship(type = "postedby",direction = Relationship.INCOMING)
private List<Challenge> challenges;
public List<Challenge> getChallenges(){
    return challenges;
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

UserPost(){

}

}
