package com.stackroute.springbootneo4jdemo.repository;

import com.stackroute.springbootneo4jdemo.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends Neo4jRepository<User,Long> {

//@Query("MATCH (u:User)<-[r:postedby]-(c:Challenge) RETURN u,r,c")
@Query("MATCH (u:User)<-[r:isattempted]-(c:Challenge) RETURN u,r,c")
List<User> getAllUsers();

}
