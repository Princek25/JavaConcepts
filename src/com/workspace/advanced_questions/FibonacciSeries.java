package com.workspace.advanced_questions;

// fibonacci Series -> 0,1,1,2,3,5,8....

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;  // a -> the first number
        int b = 1;  // b -> the second number
        int c = a + b;
        int term = 5;

        for (int i = 0; i <= term; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
