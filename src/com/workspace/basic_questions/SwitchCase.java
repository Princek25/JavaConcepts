package com.workspace.basic_questions;

import java.util.Scanner;

public class SwitchCase {
    public static void calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        System.out.println("Press 1 to add, Press 2 to sub, Press 3 to multiply, " +
                           "Press 4 to divide, Press 5 to find the remainder");
        int option = sc.nextInt();
        int result;

        switch (option) {
            case 1:
                System.out.println("Addition:- " + (result = a + b));
                break;
            case 2:
                System.out.println("Subtraction:- " + (result = a - b));
                break;
            case 3:
                System.out.println("Multiplication:- " + (result = a * b));
                break;
            case 4:
                System.out.println("Division:- " + (result = a / b));
                break;
            case 5:
                System.out.println("Remainder:- " + (result = a % b));
                break;
        }
    }

    public static void main(String[] args) {
        calculation();
    }
}
