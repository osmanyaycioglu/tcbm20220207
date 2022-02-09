package com.training.tcmb.spring.customer.rest;

import com.training.tcmb.spring.customer.mappings.CustomerMapping;
import com.training.tcmb.spring.customer.models.Customer;
import com.training.tcmb.spring.customer.rest.models.CustomerRest;
import com.training.tcmb.spring.customer.services.CustomerService;
import com.training.tcmb.spring.rest.ICustomerProvisionController;
import com.training.tcmb.spring.rest.ProvisionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/customer/provision")
@Validated
public class CustomerProvisionController implements ICustomerProvisionController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public ProvisionResponse add(@Validated @RequestBody CustomerRest customer) {
//        if (customer.getName() == null) {
//            throw new IllegalArgumentException("name alanı boş olamaz");
//        }
        customerService.add(CustomerMapping.toCustomer(customer));
        ProvisionResponse provisionResponse = new ProvisionResponse();
        provisionResponse.setMessage("Müşteri datası başarılı şekilde eklendi : " + customer);
        provisionResponse.setReturnCode(100);
        return provisionResponse;
    }

    @GetMapping("/remove")
    public ProvisionResponse remove(@NotNull @RequestBody Long customerId) {
        ProvisionResponse provisionResponse = new ProvisionResponse();
        provisionResponse.setMessage("Müşteri datası başarılı şekilde silindi : " + customerId);
        provisionResponse.setReturnCode(120);
        return provisionResponse;
    }

}
