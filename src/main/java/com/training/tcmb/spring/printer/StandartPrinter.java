package com.training.tcmb.spring.printer;

import com.training.tcmb.spring.customer.models.Customer;

public class StandartPrinter implements ICardPrinter {

    private String cardMessage;

    public StandartPrinter(String cardMessage) {
        this.cardMessage = cardMessage;
    }

    @Override
    public String printCard(Customer customer) {
        return cardMessage + " " + customer.getName() + " " + customer.getSurname();
    }
}
