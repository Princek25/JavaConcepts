package com.workspace.advanced_questions;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        int fact;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                fact = i;
                System.out.print(fact + " ");
            }
        }
    }
}
