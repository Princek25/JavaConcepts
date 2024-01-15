package com.workspace.basic_questions;

public class ExtractDigit {
    public static void main(String[] args) {
        int i = 1245;
        int rem;

        while (i != 0) {
            rem = i % 10;
            System.out.print(rem + " ");
            i = i/10;
        }
    }
}
