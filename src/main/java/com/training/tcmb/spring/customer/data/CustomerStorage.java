package com.training.tcmb.spring.customer.data;

import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CustomerStorage implements ICustomerData {
    private Map<Long, Customer> customerMap = new ConcurrentHashMap<>();
    private long cid = 0;

    public synchronized long increase(){
            cid++;
            return cid;
    }

    public Long write(Customer customer){
        long increase = increase();
        customer.setCustomerId(increase);
        customerMap.put(increase,customer);
        return increase;
    }

    public void delete(Long customerId){
        customerMap.remove(customerId);
    }

    public List<Customer> getAll() {
        // Set<Long> longs = customerMap.keySet();
        // Set<Map.Entry<Long, Customer>> entries = customerMap.entrySet();
        return new ArrayList<>(customerMap.values());
    }

    public Customer getOne(Long customerId){
        return customerMap.get(customerId);
    }

    @Override
    public List<Customer> getByName(String name) {
        return null;
    }


}
