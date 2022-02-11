package com.training.tcmb.spring.customer.services;

import com.training.tcmb.spring.customer.data.db.ICustomerLogDao;
import com.training.tcmb.spring.customer.models.Customer;
import com.training.tcmb.spring.customer.models.CustomerProvisionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerProvisionLogService {

    @Autowired
    private ICustomerLogDao customerLogDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void writeLog(Customer customer) {
        CustomerProvisionLog provisionLog = new CustomerProvisionLog();
        provisionLog.setLogLevel("INFO");
        provisionLog.setLogStr(customer.toString());
        customerLogDao.save(provisionLog);
    }
}
