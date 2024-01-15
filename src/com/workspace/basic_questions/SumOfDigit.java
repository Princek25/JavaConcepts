package com.workspace.basic_questions;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 1256;
        int sum = 0;
        int rem;

        while (n != 0){
            rem = n % 10;         // rem = 6   // rem = 5      // rem = 2    // rem = 1
            sum = sum + rem;      // sum = 6   // sum = 11     // sum = 13   // sum = 14
            n = n / 10;           // n= 125    // n = 12       // n = 1      // n = 0
        }
        System.out.println("The sum of the digit is:- " + sum);
    }
}
