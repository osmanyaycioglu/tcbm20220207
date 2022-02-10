package com.training.tcmb.spring.customer.data.db;

import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDao extends CrudRepository<Customer,Long> {
}
