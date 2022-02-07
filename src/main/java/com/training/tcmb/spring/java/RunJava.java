package com.training.tcmb.spring.java;

public class RunJava {

    public static void main(String[] args) {
        Hello hello = new Hello();
        Hello hello1 = new Hello();
        Hello hello2 = new Hello();
        Hello hello3 = new Hello();
        SayHello sayHello = new SayHello(hello);
        sayHello.sayIt("osman");
    }

}
