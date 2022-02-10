package com.training.tcmb.spring.customer.services;

import com.training.tcmb.spring.customer.data.CustomerDataManagement;
import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerQueryService {

    @Autowired
    private CustomerDataManagement cdm;

    public List<Customer> getAll() {
        return cdm.getAll();
    }

    public Customer getOne(Long customerId){
        return cdm.getOne(customerId);
    }
}
