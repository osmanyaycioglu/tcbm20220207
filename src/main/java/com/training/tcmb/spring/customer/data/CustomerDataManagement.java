package com.training.tcmb.spring.customer.data;

import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDataManagement {

    @Autowired
    private ICustomerData customerData;

    public Long write(Customer customer){
        return customerData.write(customer);
    }

    public void delete(Long customerId){
        customerData.delete(customerId);
    }

    public List<Customer> getAll() {
        return customerData.getAll();
    }

    public Customer getOne(Long customerId){
        return customerData.getOne(customerId);
    }
}
