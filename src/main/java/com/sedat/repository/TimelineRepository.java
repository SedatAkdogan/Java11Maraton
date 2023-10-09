package com.sedat.repository;

import com.sedat.repository.entity.Timeline;
import com.sedat.utility.HibernateUtility;
import com.sedat.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class TimelineRepository extends MyFactoryRepository<Timeline,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public TimelineRepository() {
        super(new Timeline());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();

    }
}
