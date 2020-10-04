package com.kodilla;

import java.util.Scanner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Calculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //SpringApplication.run(Calculator.class, args);
        Calculator calc = new Calculator();

        calc.add();
        calc.sub();

    }

    public void add() {
        System.out.println("ADD");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public void sub() {
        System.out.println("SUB");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }


}


