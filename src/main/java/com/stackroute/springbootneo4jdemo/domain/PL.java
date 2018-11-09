package com.stackroute.springbootneo4jdemo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class PL {
    @GraphId
    private Long id;
    private String name;

@Relationship(type = "isA",direction = Relationship.INCOMING)
private List<FLanguage>fLanguages;
public List<FLanguage> getfLanguages(){
    return fLanguages;
}

public PL() {
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}


}
