package com.workspace.array;

public class AddElements {
    public static void main(String[] args) {
        int[] a = {10,23,56,24,15,95};
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of the elements of the array: " + sum);
    }
}
