package com.training.tcmb.spring.rest;

import com.training.tcmb.spring.printer.Customer;
import com.training.tcmb.spring.printer.EGender;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer/query")
public class CustomerQueryController {

    @GetMapping("/get/all")
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer().setName("test1")
                                       .setSurname("sur1")
                                       .setCustomerId(1L)
                                       .setGender(EGender.MALE));
        customerList.add(new Customer().setName("test2")
                                       .setSurname("sur2")
                                       .setCustomerId(2L)
                                       .setGender(EGender.FEMALE));
        return customerList;
    }

    @GetMapping("/get/single")
    public Customer get(@RequestBody Long customerId) {
        return new Customer().setName("test")
                             .setSurname("sur")
                             .setCustomerId(customerId)
                             .setGender(EGender.MALE);
    }

}
