package com.training.tcmb.spring.customer.rest;

import com.training.tcmb.spring.customer.data.CustomerStorage;
import com.training.tcmb.spring.customer.mappings.CustomerMapping;
import com.training.tcmb.spring.customer.models.Customer;
import com.training.tcmb.spring.customer.rest.models.CustomerRest;
import com.training.tcmb.spring.customer.services.CustomerQueryService;
import com.training.tcmb.spring.printer.EGender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer/query")
public class CustomerQueryController {

    @Autowired
    private CustomerQueryService customerQueryService;

    @GetMapping("/get/all")
    public List<CustomerRest> getAll() {
        return CustomerMapping.toCustomersRest( customerQueryService.getAll());
    }

    @GetMapping("/get/single")
    public CustomerRest get(@RequestParam("cid") Long customerId) {
        return CustomerMapping.toCustomerRest(customerQueryService.getOne(customerId));
    }

}
