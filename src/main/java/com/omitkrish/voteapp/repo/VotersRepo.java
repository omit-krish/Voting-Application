package com.omitkrish.voteapp.repo;

import com.omitkrish.voteapp.DTO.VoterDTO;
import com.omitkrish.voteapp.entity.VotersEntity;

public interface VotersRepo {


    void saveVoterData(VoterDTO voterDTO);

    VotersEntity findByName(String voterName);

}
