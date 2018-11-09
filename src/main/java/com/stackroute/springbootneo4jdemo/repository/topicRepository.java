package com.stackroute.springbootneo4jdemo.repository;


import com.stackroute.springbootneo4jdemo.domain.topic;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface topicRepository extends Neo4jRepository<topic,Long> {

    @Query("MATCH(t:topic)<-[r:subconceptof]-(s:subtopic) return t,r,s")
    List<topic> getAlltopics();
}
