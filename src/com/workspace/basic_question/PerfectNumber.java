package com.workspace.basic_question;

public class PerfectNumber {
    public static void main(String[] args) {

        int n = 6;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println("Yes! the no. is perfect");
        } else System.out.println("No! this no. is not a perfect number");
    }
}
