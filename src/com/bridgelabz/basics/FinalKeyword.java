package com.bridgelabz.basics;

public class FinalKeyword {

    // final value cannot be change or variable name should be capital
    final int MAXIMUM = 10;
    static final int MAX2 = 20;

    public static void main(String[] args) {

        // calling process of final keywords: instance variable - by creating an object
        FinalKeyword finalKeyword = new FinalKeyword();
        System.out.println(finalKeyword.MAXIMUM);

        // calling process of final keyword: static variable - directly
        System.out.println(MAX2);

    }
}
