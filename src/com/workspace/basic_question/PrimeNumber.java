package com.workspace.basic_question;

public class PrimeNumber {
    public static void main(String[] args) {

        int n = 17;
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
        if (count == 0) {
            System.out.println(n + " is a prime number");
        } else System.out.println(n + " is not a prime number");
    }
}
