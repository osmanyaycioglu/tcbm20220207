package com.training.tcmb.spring.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShowPrintedCards implements CommandLineRunner {

    @Qualifier("standartPrinter")
    @Autowired
    private ICardPrinter sPrinter;
    @Qualifier("extendedPrinter")
    @Autowired
    private ICardPrinter ePrinter;
    @Qualifier("customPrinter")
    @Autowired
    private ICardPrinter cPrinter;

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer().setName("osman")
                                          .setSurname("yaycıoğlu")
                                          .setGender(EGender.MALE);
        System.out.println("Standart : " + sPrinter.printCard(customer));
        System.out.println("Extended : " + ePrinter.printCard(customer));
        System.out.println("Custom : " + cPrinter.printCard(customer));
    }
}
