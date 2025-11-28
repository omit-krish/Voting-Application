package com.omitkrish.voteapp.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import org.hibernate.property.access.spi.Getter;

//here implements inheritance - hibernate relation single
@Entity
@DiscriminatorValue(("Sravanthi"))
public class SravanthiEntity extends ElectionEntity {

    private String candidateName;

    public SravanthiEntity() {
    }

    public SravanthiEntity(int id, long votes_count, double votingPercentage, String candidateName) {
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
        return "SravanthiEntity{" +
                "candidateName='" + candidateName + '\'' +
                '}';
    }


}



