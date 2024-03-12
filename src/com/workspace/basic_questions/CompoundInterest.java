package com.workspace.basic_questions;

import java.util.Scanner;

public class CompoundInterest {

    public static void compoundInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        float principle = sc.nextFloat();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter time in year: ");
        float time = sc.nextFloat();
        float amount = (float) (principle * Math.pow((1 + rate/100), time));
        float ci = amount - principle;
        System.out.println("The amount is: " + amount);
        System.out.println("The compound interest is: " + ci);
    }

    public static void main(String[] args) {
        compoundInterest();
    }
}
