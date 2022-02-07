package com.training.tcmb.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

// @Component
public class CalculatorRunner implements CommandLineRunner {

    private Calculator calculator;

    @Autowired
    public CalculatorRunner(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run(String... args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1-Toplama ");
            System.out.println("2-Çıkarma ");
            System.out.println("3-Çarpma ");
            System.out.println("4-Bölme ");
            System.out.println("Seçiminiz");
            int index = scanner.nextInt();
            System.out.println("ilk rakam : ");
            int ival1 = scanner.nextInt();
            System.out.println("ikinci rakam : ");
            int ival2 = scanner.nextInt();
            System.out.println("Sonuç = " + calculator.calculate(index,ival1,ival2));

        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}
