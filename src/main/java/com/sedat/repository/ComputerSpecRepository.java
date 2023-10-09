package com.sedat.repository;

import com.sedat.repository.entity.ComputerSpec;
import com.sedat.utility.HibernateUtility;
import com.sedat.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerSpecRepository extends MyFactoryRepository<ComputerSpec,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerSpecRepository() {
        super(new ComputerSpec());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
