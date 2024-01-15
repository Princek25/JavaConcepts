package com.workspace.basic_questions;

public class NaturalNumber {
    public static void main(String[] args) {
        int range = 5;
        int sum = 0;

        for (int i = 1; i <= range; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + range + " natural number is: " + sum);
    }
}
