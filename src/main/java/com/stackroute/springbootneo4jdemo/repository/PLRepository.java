package com.stackroute.springbootneo4jdemo.repository;

import com.stackroute.springbootneo4jdemo.domain.PL;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface PLRepository extends Neo4jRepository<PL,Long> {


//@Query("MATCH (u:User)<-[r:postedby]-(c:Challenge) RETURN u,r,c")
@Query("MATCH (pl:PL)<-[r:isA]-(l:FLanguage) RETURN pl,r,l")
Collection<PL> getAllPrograms();

}
