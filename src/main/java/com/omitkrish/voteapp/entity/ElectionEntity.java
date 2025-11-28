package com.omitkrish.voteapp.entity;

import jakarta.persistence.*;

import java.security.PrivateKey;

@Entity
//inheritance from here
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "election_entity",discriminatorType = DiscriminatorType.STRING)
public abstract class ElectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long votes_count;
    private double votingPercentage;

    public ElectionEntity(){

    }

    public ElectionEntity(int id, long votes_count, double votingPercentage) {
        this.id = id;
        this.votes_count = votes_count;
        this.votingPercentage = votingPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVotes_count() {
        return votes_count;
    }

    public void setVotes_count(long votes_count) {
      this.votes_count = votes_count;
    }

    public double getVotingPercentage() {
        return votingPercentage;
    }

    public void setVotingPercentage(double votingPercentage) {
        this.votingPercentage = votingPercentage;
    }

    @Override
    public String toString() {
        return "ElectionEntity{" +
                "id=" + id +
                ", Votes_count=" + votes_count +
                ", votingPercentage=" + votingPercentage +
                '}';
    }
}
