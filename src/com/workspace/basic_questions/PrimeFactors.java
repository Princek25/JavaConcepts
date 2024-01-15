package com.workspace.basic_questions;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 2160;  
        int prime = 0;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
    }
}
