package com.training.tcmb.spring.rest;

import com.training.tcmb.spring.customer.models.Customer;
import com.training.tcmb.spring.customer.rest.models.CustomerRest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICustomerProvisionController {
    @Operation(summary = "Add new customer",description = "işte girdiğimiz desc",tags = "xyz")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProvisionResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content) })
    public ProvisionResponse add(@Validated @RequestBody CustomerRest customer);

}
