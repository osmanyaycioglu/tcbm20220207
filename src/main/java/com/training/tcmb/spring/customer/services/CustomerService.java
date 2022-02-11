package com.training.tcmb.spring.customer.services;

import com.training.tcmb.spring.customer.data.CustomerDataManagement;
import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerService {

    @Autowired
    private CustomerDataManagement cdm;

    @Transactional(propagation = Propagation.REQUIRED)
    public Long add(Customer customer) {
        // subMethod(customer);
        return cdm.write(customer);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void subMethod(Customer customer) {
        cdm.write(customer);
    }

    public void remove(Long customerId){
        cdm.delete(customerId);
    }
}
