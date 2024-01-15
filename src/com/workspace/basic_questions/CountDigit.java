package com.workspace.basic_questions;

public class CountDigit {
    public static void main(String[] args) {

        int n = 125645;
        int rem;
        int count = 0;

        while (n != 0){
            rem = n % 10;  // 5     // 4    // 2    // 1
            count++;       // 1     // 2    // 3    // 4
            n = n / 10;    // 124   // 12   // 1    // 0
        }
        System.out.println("Number of digit: " + count);
    }
}
