package com.omitkrish.voteapp.service;

import com.omitkrish.voteapp.entity.ElectionEntity;
import com.omitkrish.voteapp.entity.krishEntity;
import com.omitkrish.voteapp.repo.ElectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionServiceImpl implements ElectionService
{

    //dependencies injection
    @Autowired
    private ElectionRepo electionRepo;



    @Override
    public List<ElectionEntity> findAllCandidates() throws RuntimeException {

        List<ElectionEntity> allCandidates = electionRepo.findAllCandidates();
        if(allCandidates!=null){
            return allCandidates;
        }
       else{

           throw new RuntimeException("candidates not at declare .. wait for few more minutes...");
        }
    }

    @Override
    public ElectionEntity findElectionEntityByName(String candidateName) {

        ElectionEntity electionEntity=  electionRepo.findElectionEntityByName(candidateName);

        if(electionEntity!=null){
            return electionEntity;
        }else{

            throw new RuntimeException("candidate not found");
        }

    }

    @Override
    public Boolean updateElectionEntity(ElectionEntity electionEntity) {

        electionEntity.setVotes_count(electionEntity.getVotes_count()+1);
       Boolean updateStatus= electionRepo.updateElectionEntity(electionEntity);

        return updateStatus;
    }

    @Override
    public ElectionEntity findResult() {

        ElectionEntity electionResult=new krishEntity();

        List<ElectionEntity> allCandidates = electionRepo.findAllCandidates();

        for(ElectionEntity candidate:allCandidates){

            if(candidate.getVotes_count()>electionResult.getVotes_count()){

                electionResult=  candidate;
            }
        }

        return electionResult;
    }
}
