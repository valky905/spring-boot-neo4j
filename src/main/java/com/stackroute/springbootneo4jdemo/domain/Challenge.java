package com.stackroute.springbootneo4jdemo.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Challenge {
    @GraphId
    private Long challengeId;
    private String challengeName;

public Challenge() {
}

public Long getChallengeId() {
    return challengeId;
}

public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
}

public String getChallengeName() {
    return challengeName;
}

public void setChallengeName(String challengeName) {
    this.challengeName = challengeName;
}
}
