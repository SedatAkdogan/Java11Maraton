package com.sedat.repository;

import com.sedat.repository.entity.Computer;
import com.sedat.utility.HibernateUtility;
import com.sedat.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerRepository extends MyFactoryRepository<Computer,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerRepository() {
        super(new Computer());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
