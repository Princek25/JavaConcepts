package com.workspace.exception_handling;

import java.util.Scanner;

// define -> customized exception classes - TooOldException and TooYoungException
// using those customized exception here in Matrimonial App.
public class Matrimonial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // int age = Integer.parseInt(args[0]); to take from command prompt
        if (age > 60) {
            throw new TooOldException("Too old to marriage");
        } else if (age < 18) {
            throw new TooYoungException("Too young to marriage");
        } else System.out.println("Thanks for registration");
    }
}
