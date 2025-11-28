package com.omitkrish.voteapp.repo;

import com.omitkrish.voteapp.entity.ElectionEntity;

import java.util.List;

public interface ElectionRepo {


   List<ElectionEntity> findAllCandidates();

    ElectionEntity findElectionEntityByName(String candidateName);

    Boolean updateElectionEntity(ElectionEntity electionEntity);

}
