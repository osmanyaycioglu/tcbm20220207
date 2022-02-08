package com.training.tcmb.spring.rest;

import com.training.tcmb.spring.printer.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer/provision")
public class CustomerProvisionController {

    @PostMapping("/add")
    public ProvisionResponse add(@RequestBody Customer customer) {
        ProvisionResponse provisionResponse = new ProvisionResponse();
        provisionResponse.setMessage("Müşteri datası başarılı şekilde eklendi : " + customer);
        provisionResponse.setReturnCode(100);
        return provisionResponse;
    }

    @GetMapping("/remove")
    public ProvisionResponse remove(@RequestBody Long customerId) {
        ProvisionResponse provisionResponse = new ProvisionResponse();
        provisionResponse.setMessage("Müşteri datası başarılı şekilde silindi : " + customerId);
        provisionResponse.setReturnCode(120);
        return provisionResponse;
    }

}
