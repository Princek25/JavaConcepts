package com.workspace.advanced_questions;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 196;
        int sum;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n / i == i) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("It is not a perfect square");
        } else System.out.println("It is a perfect square");
    }
}
