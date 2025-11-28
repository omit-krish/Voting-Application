package com.omitkrish.voteapp.repo;

import com.omitkrish.voteapp.entity.ElectionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionRepoImpl  implements ElectionRepo{

    //dependency injection here....

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<ElectionEntity> findAllCandidates() {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        Query<ElectionEntity> fromElectionEntity = session.createQuery("from ElectionEntity", ElectionEntity.class);
        List<ElectionEntity> electionEntities = fromElectionEntity.getResultList();
        session.getTransaction().commit();
        session.close();

        //implements terminal operation
        return  (!electionEntities.isEmpty())?electionEntities:null;

        }

    @Override
    public ElectionEntity findElectionEntityByName(String candidateName) {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        //hql query language..
        List<ElectionEntity> electionEntityList = session.createQuery("from ElectionEntity where candidateName=:CANDIDATE", ElectionEntity.class)
                .setParameter("CANDIDATE", candidateName)
                .getResultList();
        session.getTransaction().commit();
        session.close();

//        /terminal operation
        return  (!electionEntityList.isEmpty())?electionEntityList.get(0):null;


    }

    @Override
    public Boolean updateElectionEntity(ElectionEntity electionEntity) {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        ElectionEntity election = session.merge(electionEntity);
        session.getTransaction().commit();
        session.close();
        boolean updateStatus = (election != null) ? true : false;
        return updateStatus;

    }

}
