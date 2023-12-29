package com.workspace.basic_question;

public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 2;
        int power = 4;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number; // 1*2=2 2*2=4 4*2=8
        }
        System.out.println(number + " to the power " + power + " is: " + result);
    }
}
