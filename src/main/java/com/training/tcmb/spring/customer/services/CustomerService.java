package com.training.tcmb.spring.customer.services;

import com.training.tcmb.spring.customer.data.CustomerDataManagement;
import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDataManagement cdm;

    public Long add(Customer customer){
        return cdm.write(customer);
    }

    public void remove(Long customerId){
        cdm.delete(customerId);
    }
}
