package com.training.tcmb.spring.printer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "custom.card")
public class CustomCardPrinterConfig {

    private String cardMessage;
    private String maleCardMessage;
    private String femaleCardMessage;

    public String getCardMessage() {
        return cardMessage;
    }

    public void setCardMessage(String cardMessage) {
        this.cardMessage = cardMessage;
    }

    public String getMaleCardMessage() {
        return maleCardMessage;
    }

    public void setMaleCardMessage(String maleCardMessage) {
        this.maleCardMessage = maleCardMessage;
    }

    public String getFemaleCardMessage() {
        return femaleCardMessage;
    }

    public void setFemaleCardMessage(String femaleCardMessage) {
        this.femaleCardMessage = femaleCardMessage;
    }
}
