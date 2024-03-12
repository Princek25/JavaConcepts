package com.workspace.advanced_questions;

public class Factorial {

    public static int recursion(int n){
        if (n==0 || n==1){
            return 1;
        }
        else return n * recursion(n-1);
    }
    public static void forLoop(int n){
        int product = 1;

        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println("Factorial of the num: " + product);
    }


    public static void main(String[] args) {
        forLoop(4);
        System.out.println(recursion(5));
    }
}
