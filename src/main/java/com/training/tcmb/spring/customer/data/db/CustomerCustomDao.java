package com.training.tcmb.spring.customer.data.db;

import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

//@Component
public class CustomerCustomDao {
    @PersistenceContext
    private EntityManagerFactory emf;

    @Autowired
    private UserTransaction userTransaction;

    // @Transactional
    public void insert(Customer customer) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
        } catch (Exception exp){
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.getTransaction().commit();
        }
    }

    @Transactional
    public void insert2(Customer customer) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.joinTransaction();
        entityManager.persist(customer);
    }

}
