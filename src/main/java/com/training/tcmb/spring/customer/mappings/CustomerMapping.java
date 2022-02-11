package com.training.tcmb.spring.customer.mappings;

import com.training.tcmb.spring.customer.models.Address;
import com.training.tcmb.spring.customer.models.Customer;
import com.training.tcmb.spring.customer.models.Phone;
import com.training.tcmb.spring.customer.rest.models.CustomerRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CustomerMapping {
    public static Customer toCustomer(CustomerRest customerIn) {
        Customer customerOut = new Customer();
        customerOut.setName(customerIn.getName());
        customerOut.setSurname(customerIn.getSurname());
        customerOut.setHeight(customerIn.getHeight());
        customerOut.setBirthday(customerIn.getBirthday());
        customerOut.setPassword(customerIn.getPassword());
        customerOut.setWeight(customerIn.getWeight());
        customerOut.setGender(customerIn.getGender());
        Address address = customerIn.getAddress();
        address.setCustomer(customerOut);
        customerOut.setAddress(address);
        Set<Phone> phones = customerIn.getPhones();
        for (Phone ph:phones) {
            ph.setCustomer(customerOut);
        }
        customerOut.setPhones(phones);
        return customerOut;
    }

    public static CustomerRest toCustomerRest(Customer customerIn) {
        CustomerRest customerOut = new CustomerRest();
        customerOut.setName(customerIn.getName());
        customerOut.setSurname(customerIn.getSurname());
        customerOut.setHeight(customerIn.getHeight());
        customerOut.setBirthday(customerIn.getBirthday());
        customerOut.setPassword(customerIn.getPassword());
        customerOut.setWeight(customerIn.getWeight());
        customerOut.setGender(customerIn.getGender());
        customerOut.setAddress(customerIn.getAddress());
        customerOut.setPhones(customerIn.getPhones());
        return customerOut;
    }

    public static List<CustomerRest> toCustomersRest(List<Customer> all) {
        List<CustomerRest> customerRests = new ArrayList<>();
        for (Customer customer : all) {
            customerRests.add(toCustomerRest(customer));
        }
        return customerRests;
    }
}
