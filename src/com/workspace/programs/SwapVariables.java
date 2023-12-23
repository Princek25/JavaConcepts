package com.workspace.programs;

public class SwapVariables {

    public static void swapVariableUsingThirdVariable(int n1, int n2) {
        int temp = n2;
        n2 = n1;
        n1 = temp;
        System.out.println("The value of n1: " + n1);
        System.out.println("The value of n2: " + n2);
    }

    public static void swapVariablesWithoutThirdVariable(int n1, int n2) {
        int temp = n1 + n2;
        n1 = temp - n1;
        n2 = temp - n2;
        System.out.println("The value of n1: " + n1);
        System.out.println("The value of n2: " + n2);
    }

    public static void main(String[] args) {
        swapVariableUsingThirdVariable(12, 56);
        swapVariablesWithoutThirdVariable(10, 20);
    }
}
