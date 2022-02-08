package com.training.tcmb.spring.rest;

import com.training.tcmb.spring.di.IGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    private Environment env;

    @Autowired
    @Qualifier("currentGreeting")
    private IGreet greet;

    @GetMapping("/get/custom/greeting/message")
    public String getCustomGreetingMessage() {
        return env.getProperty("custom.card.cardMessage");
    }

    @GetMapping("/greet/person")
    public String greetPerson(@RequestParam("isim") String name,
                              @RequestParam("soy") String surname) {
        return greet.greet(name + " " + surname);
    }

    @GetMapping("/salute/person/{xyz}")
    public String greetPerson2(@PathVariable("xyz") String name,
                              @RequestParam("soy") String surname) {
        return greet.greet(name + " " + surname);
    }

    @GetMapping("/selam/person/{xyz}/surname/{abc}")
    public String greetPerson3(@PathVariable("xyz") String name,
                               @PathVariable("abc") String surname) {
        return greet.greet(name + " " + surname);
    }

}
