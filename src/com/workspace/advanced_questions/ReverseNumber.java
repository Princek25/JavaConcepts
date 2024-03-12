package com.workspace.advanced_questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1245;
        int remainder;
        int reverse = 0;

        while (number != 0) {
            remainder = number % 10; // 5
            reverse = reverse * 10 + remainder; // 5
            number = number / 10; // 124
        }
        System.out.println("The reverse of the number is: " + reverse);
    }
}
