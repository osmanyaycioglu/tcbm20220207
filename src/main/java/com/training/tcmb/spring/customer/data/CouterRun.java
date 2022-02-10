package com.training.tcmb.spring.customer.data;

import java.util.concurrent.CountDownLatch;

public class CouterRun {
    public static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(THREAD_COUNT);
        // sdfkjsjd
        for (int i = 0; i < THREAD_COUNT; i++) {
            CounterTest counterTest = new CounterTest(cd);
            counterTest.start();
        }
        try {
            cd.await();
            System.out.println("Sonuç : " + CounterTest.counter);
            System.out.println("Sonuç : " + CounterTest.counter2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
