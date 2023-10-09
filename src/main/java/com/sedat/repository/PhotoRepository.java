package com.sedat.repository;

import com.sedat.repository.entity.Photo;
import com.sedat.utility.HibernateUtility;
import com.sedat.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PhotoRepository extends MyFactoryRepository<Photo,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;


    public PhotoRepository() {
        super(new Photo());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
