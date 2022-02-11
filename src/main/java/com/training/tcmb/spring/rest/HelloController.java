package com.training.tcmb.spring.rest;

import com.training.tcmb.other.Echo;
import com.training.tcmb.spring.customer.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Echo echo;

    @GetMapping("/hello/echo")
    public String echo(@RequestParam("str")  String str) {
        return echo.echo(str);
    }


    @GetMapping("/hello8/{operation}")
    public ResponseEntity<?> hello8(@PathVariable("operation")  String op) {
        switch (op){
            case "add":
                return ResponseEntity.status(201)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body("Hello7 Name : ");
            case "remove":
                return ResponseEntity.status(202)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body(new Customer().setName("test"));
            case "xyz":
                return ResponseEntity.status(203)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body(new Customer().setName("test"));
            default:
                return ResponseEntity.status(400)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body("Error");


        }

    }

    @GetMapping("/hello7")
    public ResponseEntity<?> hello7(HttpServletRequest httpServletRequest) {
        String op = httpServletRequest.getParameter("op");
        switch (op){
            case "add":
                return ResponseEntity.status(201)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body("Hello7 Name : ");
            case "remove":
                return ResponseEntity.status(202)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body(new Customer().setName("test"));
            case "xyz":
                return ResponseEntity.status(203)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body(new Customer().setName("test"));
            default:
                return ResponseEntity.status(400)
                                     .header("X-test",
                                             "test1")
                                     .header("Content-Type",
                                             "app/xyz")
                                     .body("Error");


        }
    }

    @GetMapping("/hello6")
    public ResponseEntity<String> hello5(HttpServletRequest httpServletRequest) {
        String isim = httpServletRequest.getParameter("isim");
        return ResponseEntity.status(201)
                             .header("X-test",
                                     "test1")
                             .header("Content-Type",
                                     "app/xyz")
                             .body("Hello5 Name : " + isim);
    }

    @GetMapping("/hello5/{xyz}")
    public ResponseEntity<String> hello5(@PathVariable("xyz") String name) {
        return ResponseEntity.status(201)
                             .header("X-test",
                                     "test1")
                             .header("Content-Type",
                                     "app/xyz")
                             .body("Hello5 Name : " + name);
    }


    @GetMapping("/hello4/{yas}")
    public String hello4(@RequestParam("isim") String name,
                         @RequestHeader("soy") String surname,
                         @PathVariable("yas") Integer age) {
        return "Hello4 Name : " + name + " Surname : " + surname + " Age : " + age;
    }


    @GetMapping("/hello2")
    public String hello2(@RequestParam("isim") String name,
                         @RequestParam("soy") String surname,
                         @RequestParam("yas") Integer age) {
        return "Hello2 Name : " + name + " Surname : " + surname + " Age : " + age;
    }

    @GetMapping("/hello3/{xyz}")
    public String hello2(@PathVariable("xyz") String name) {
        return "Hello3 Name : " + name;
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
