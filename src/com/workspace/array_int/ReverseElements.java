package com.workspace.array_int;

public class ReverseElements {
    public static void main(String[] args) {
        int[] a = {12, 56, 23, 45, 24, 62};
        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
