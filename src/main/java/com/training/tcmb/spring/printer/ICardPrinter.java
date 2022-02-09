package com.training.tcmb.spring.printer;

import com.training.tcmb.spring.customer.models.Customer;

public interface ICardPrinter {
    String printCard(Customer customer);
}
