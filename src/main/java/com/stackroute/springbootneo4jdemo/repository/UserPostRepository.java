package com.stackroute.springbootneo4jdemo.repository;

import com.stackroute.springbootneo4jdemo.domain.User;
import com.stackroute.springbootneo4jdemo.domain.UserPost;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface UserPostRepository extends Neo4jRepository<User,Long> {
@Query("MATCH (u:User)<-[r:postedby]-(c:Challenge) RETURN u,r,c")
List<User> getAllUsers();
}
