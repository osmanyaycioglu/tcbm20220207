package com.training.tcmb.spring.calculator;

import org.junit.jupiter.api.*;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class DivOperationTest {
    DivOperation divOperation;

    @BeforeAll
    static void setup() {
        System.out.println("Before ALl");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After ALl");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Test");
        divOperation = new DivOperation();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Test");

    }

    @Test
    public void whenICallThis_expectSomethingDifferent() {
        System.out.println("Test1");
        int process = divOperation.process(100,
                                           10);
        if (process != 10) {
            throw new AssertionFailedError("11 bekliyordum " + process + " geldi",
                                           11,
                                           process);
        }
        int process2 = divOperation.process(100,
                                            1);

        Assertions.assertEquals(100,
                                process2);

        Assertions.assertThrows(ArithmeticException.class,
                                () -> divOperation.process(10,
                                                           0));

    }


    @Test
    @DisplayName("şunu verdiğimde bunu bekliyorum")
    public void givenICallThis_expectSomethingDifferent() {
        int process2 = divOperation.divide(100,
                                            1);

        Assertions.assertEquals(100,
                                process2);

        int process3 = divOperation.divide(null,
                                           1);
        Assertions.assertEquals(0,
                                process3);

        Assertions.assertThrows(ArithmeticException.class,
                                () -> divOperation.divide(10,
                                                          null));
    }

}