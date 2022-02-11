package com.training.tcmb.spring.customer.data;

import com.training.tcmb.spring.customer.data.db.ICustomerDao;
import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//@Service
//@Profile("database")
public class CustomerDB implements ICustomerData {

    @Autowired
    private ICustomerDao customerDao;

    public Long write(Customer customer){
        Customer savedCustomer = customerDao.save(customer);
        return savedCustomer.getCustomerId();
    }

    public void delete(Long customerId){
        customerDao.deleteById(customerId);
    }

    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        Iterable<Customer> all = customerDao.findAll();
        for (Customer cust:all) {
            customerList.add(cust);
        }
        return customerList;
    }

    public Customer getOne(Long customerId){
        return customerDao.findById(customerId).orElse(null);
    }

    @Override
    public List<Customer> getByName(String name) {
        return null;
    }


}
