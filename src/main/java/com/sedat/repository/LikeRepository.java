package com.sedat.repository;

import com.sedat.repository.entity.Like;
import com.sedat.utility.HibernateUtility;
import com.sedat.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class LikeRepository extends MyFactoryRepository<Like,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public LikeRepository() {
        super(new Like());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

}
