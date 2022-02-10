package com.training.tcmb.spring.customer.data;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class CounterTest extends Thread {
    public static long counter = 0;
    public static AtomicLong counter2 = new AtomicLong(0);
    private static ReentrantLock cLock = new ReentrantLock();

    private CountDownLatch countDownLatch ;

    public CounterTest(CountDownLatch countDownLatch ){
        this.countDownLatch = countDownLatch;
    }

    public void increase(){
        try {
            cLock.lock();
            counter++;
        } catch (Exception exp){
            exp.printStackTrace();
        } finally {
            cLock.unlock();
        }
    }

    public static void increase2(){
        synchronized (CounterTest.class){
            counter++;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000_000; i++) {
            counter++;
            // counter2.incrementAndGet();
            // increase();
        }
        countDownLatch.countDown();
    }

}
