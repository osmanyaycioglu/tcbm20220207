package com.training.tcmb.spring.customer.data;

import com.training.tcmb.spring.customer.models.Customer;

import java.util.List;

public interface ICustomerData {

    Long write(Customer customer);

    void delete(Long customerId);

    List<Customer> getAll();

    Customer getOne(Long customerId);

    List<Customer> getByName(String name);
}
