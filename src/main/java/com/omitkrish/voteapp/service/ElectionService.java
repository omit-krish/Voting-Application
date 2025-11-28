package com.omitkrish.voteapp.service;

import com.omitkrish.voteapp.entity.ElectionEntity;

import java.util.List;

public interface ElectionService{
   List<ElectionEntity> findAllCandidates();

    ElectionEntity findElectionEntityByName(String candidateName);

    Boolean updateElectionEntity(ElectionEntity electionEntity);

    ElectionEntity findResult();

}
