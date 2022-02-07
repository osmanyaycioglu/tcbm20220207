package com.training.tcmb.spring.java.scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

// @Component
public class ScannerRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bana bir numara ver : ");
            int index = scanner.nextInt();
            System.out.println("Bana verdiğin index = " + index);
            System.out.println("Bana bir numara daha ver : ");
            int index2 = scanner.nextInt();
            System.out.println("Bana verdiğin index2 = " + index2);

        } catch (Exception exp) {
            exp.printStackTrace();
        }

    }
}
