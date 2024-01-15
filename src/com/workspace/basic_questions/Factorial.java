package com.workspace.basic_questions;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int product = 1;

        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println("Factorial of the num: " + product);
    }
}
