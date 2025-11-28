package com.omitkrish.voteapp.repo;

import com.omitkrish.voteapp.DTO.VoterDTO;
import com.omitkrish.voteapp.entity.VotersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VotersRepoImpl  implements  VotersRepo {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SessionFactory sessionFactory;
    //here not using transactional annotation doing manually for last time

    @Override
    public void saveVoterData(VoterDTO voterDTO) {

        VotersEntity votersEntity = modelMapper.map(voterDTO, VotersEntity.class);
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        System.out.println("inside repo method");
//save or update based on id
        session.merge(votersEntity);
        session.getTransaction().commit();
        session.close();
        //manually closing later use getCurrent transaction along with transactional annotation...
    }

    @Override
    public VotersEntity findByName(String voterName) {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        VotersEntity votersEntity = session.createQuery("from VotersEntity where voterName=:VOTERNAME",VotersEntity.class)
                .setParameter("VOTERNAME",voterName)
                .getSingleResult();
        session.getTransaction().commit();
        session.close();


        return votersEntity;
    }
}