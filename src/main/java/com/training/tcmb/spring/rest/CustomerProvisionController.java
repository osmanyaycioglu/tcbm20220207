package com.training.tcmb.spring.rest;

import com.training.tcmb.spring.printer.Customer;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/customer/provision")
@Validated
public class CustomerProvisionController {

    @PostMapping("/add")
    public ProvisionResponse add(@Validated @RequestBody Customer customer) {
//        if (customer.getName() == null) {
//            throw new IllegalArgumentException("name alanı boş olamaz");
//        }
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
