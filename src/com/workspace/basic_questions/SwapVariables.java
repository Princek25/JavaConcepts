package com.workspace.basic_questions;

public class SwapVariables {

    public static void swappingVariable1(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After swapping value of a : " + a);
        System.out.println("After swapping value of b : " + b);
    }
    public static void swappingVariable2(int a, int b){
        int sum = a + b;
        a = sum - a;
        b = sum - b;
        System.out.println("After swapping the value of a: " + a);
        System.out.println("After swapping the value of b: " + b);
    }

    public static void main(String[] args) {
        swappingVariable1(12,56);
        swappingVariable2(23,29);
    }
}
