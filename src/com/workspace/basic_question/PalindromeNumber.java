package com.workspace.basic_question;

public class PalindromeNumber {

    public static void main(String[] args) {
        int input = 121;
        int number = input;
        int reverse = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (input == reverse) {
            System.out.println("Yes it is a palindrome number");
        } else System.out.println("No it is not a palindrome number");
    }
}
