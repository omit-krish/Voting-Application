package com.omitkrish.voteapp.DTO;

public class VoterDTO {
    private int id;
    private String voterName;
    private Long aadhaarNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VoterDTO() {
    }

    public VoterDTO(int id, String voterName, Long aadhaarNo) {
        this.id = id;
        this.voterName=voterName;
        this.aadhaarNo=aadhaarNo;
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
        return "VoterDTO{" +
                "voterName='" + voterName + '\'' +
                ", aadhaarNo=" + aadhaarNo +
                '}';
    }

}
