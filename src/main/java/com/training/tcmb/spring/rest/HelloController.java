package com.training.tcmb.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello2")
    public String hello2(@RequestParam("isim") String name,
                         @RequestParam("soy") String surname,
                         @RequestParam("yas") Integer age) {
        return "Hello2 Name : " + name + " Surname : " + surname + " Age : " + age;
    }

    @GetMapping("/hello3/{xyz}")
    public String hello2(@PathVariable("xyz") String name) {
        return "Hello3 Name : " + name ;
    }


    @GetMapping("/hello1")
    // @RequestMapping(method = RequestMethod.GET,value = "/hello1")
    public String xyz() {
        return "Hello1";
    }

    @PostMapping("/hello1")
    public String met1() {
        return "Hello POST";
    }

    @PutMapping("/hello1")
    public String met2() {
        return "Hello PUT";
    }

    @DeleteMapping("/hello1")
    public String met3() {
        return "Hello DELETE";
    }

    @PatchMapping("/hello1")
    public String met4() {
        return "Hello PATCH";
    }


}
