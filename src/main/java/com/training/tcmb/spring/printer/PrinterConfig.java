package com.training.tcmb.spring.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PrinterConfig {

    @Autowired
    private Environment env;

//    @Autowired
//    private CustomCardPrinterConfig cardPrinterConfig;

    @Bean
    public ICardPrinter standartPrinter() {
        String message = env.getProperty("standard.card.message");
        return new StandartPrinter(message);
    }

    @Bean
    public ICardPrinter extendedPrinter(@Value("${extended.card.message}") String message,
                                        @Value("${extended.card.male-desc}") String maleDesc,
                                        @Value("${extended.card.female-desc}") String femaleDesc) {
        return new ExtendedPrinter(message,
                                   maleDesc,
                                   femaleDesc);
    }

    @Bean
    public ICardPrinter customPrinter(CustomCardPrinterConfig cardPrinterConfig) {
        return new CustomPrinter(cardPrinterConfig.getCardMessage(),
                                 cardPrinterConfig.getMaleCardMessage(),
                                 cardPrinterConfig.getFemaleCardMessage());
    }


}
