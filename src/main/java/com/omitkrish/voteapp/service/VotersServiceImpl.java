package com.omitkrish.voteapp.service;

import com.omitkrish.voteapp.DTO.VoterDTO;
import com.omitkrish.voteapp.entity.VotersEntity;
import com.omitkrish.voteapp.repo.VotersRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotersServiceImpl implements  VotersService{

    @Autowired
    private VotersRepo votersRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void saveVoterData(VoterDTO voterDTO) {

        votersRepo.saveVoterData(voterDTO);

    }

    @Override
    public VoterDTO findByName(String voterName) {
        VotersEntity votersEntity =  votersRepo.findByName(voterName);

        if(votersEntity==null){
            return null;
        }
        else {
            VoterDTO voterDTO = modelMapper.map(votersEntity, VoterDTO.class);
            return voterDTO;
        }


    }
}
