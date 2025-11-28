package com.omitkrish.voteapp.service;

import com.omitkrish.voteapp.DTO.VoterDTO;

public interface VotersService {
    void saveVoterData(VoterDTO voterDTO);

    VoterDTO findByName(String voterName);

}
