package com.training.tcmb.spring.customer.services;

import com.training.tcmb.spring.customer.data.CustomerDataManagement;
import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerService {

    @Autowired
    private CustomerDataManagement cdm;

    @Autowired
    private CustomerProvisionLogService customerProvisionLogService;

    int counter = 0;

    @Transactional(propagation = Propagation.REQUIRED, noRollbackFor = {IllegalArgumentException.class},isolation = Isolation.READ_COMMITTED)
    public Long add(Customer customer) {
        // STEP 1
        customerProvisionLogService.writeLog(customer);
        // STEP 2
        Long write = cdm.write(customer);
        // STEP 3
        // STEP 4
        // STEP 5
        counter++;
        if (counter % 2 == 0) {
            throw new IllegalArgumentException();
        }
        // subMethod(customer);
        return write;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void subMethod(Customer customer) {
        cdm.write(customer);
    }

    public void remove(Long customerId) {
        cdm.delete(customerId);
    }
}
