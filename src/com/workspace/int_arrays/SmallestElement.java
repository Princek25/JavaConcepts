package com.workspace.int_arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] a = {45, 78, 62, 53, 56, 23, 43};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("The smallest element is: " + min);
    }
}
