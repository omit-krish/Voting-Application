package com.omitkrish.voteapp.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
//here inheritance-hibernate using...
@Entity
@DiscriminatorValue("krish")
public class krishEntity extends ElectionEntity{

    private String candidateName;

    public krishEntity(){

    }
    public krishEntity(int id, long votes_count, double votingPercentage, String candidateName) {
        super(id, votes_count, votingPercentage);
        this.candidateName = candidateName;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    @Override
    public String toString() {
        return "krishEntity{" +
                "candidateName='" + candidateName + '\'' +
                '}';
    }
}
