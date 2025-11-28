package com.omitkrish.voteapp.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "voters_entity")
public class VotersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "voter_name", nullable = false)
    private String voterName;

    @Column(name = "aadhaar_no", unique = true)
    private Long aadhaarNo;

    public VotersEntity(){

    }
    public VotersEntity(int id, String voterName, Long aadhaarNo) {
        this.id = id;
        this.voterName = voterName;
        this.aadhaarNo = aadhaarNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public Long getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(Long aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    @Override
    public String toString() {
        return "VotersEntity{" +
                "id=" + id +
                ", voterName='" + voterName + '\'' +
                ", aadhaarNo=" + aadhaarNo +
                '}';
    }
}
