package com.training.tcmb.spring.customer.data.db;

import com.training.tcmb.spring.customer.models.CustomerProvisionLog;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerLogDao extends CrudRepository<CustomerProvisionLog,Long> {
}
