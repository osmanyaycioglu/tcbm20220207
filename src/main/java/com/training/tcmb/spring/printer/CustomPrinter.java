package com.training.tcmb.spring.printer;

public class CustomPrinter implements ICardPrinter {

    private String cardMessage;
    private String maleDesc;
    private String femaleDesc;

    public CustomPrinter(String cardMessage,
                         String maleDesc,
                         String femaleDesc) {
        this.cardMessage = cardMessage;
        this.maleDesc = maleDesc;
        this.femaleDesc = femaleDesc;
    }

    @Override
    public String printCard(Customer customer) {
        return cardMessage + " " + (customer.getGender() == EGender.MALE ? maleDesc : femaleDesc) + " " + customer.getName() + " " + customer.getSurname();
    }
}
