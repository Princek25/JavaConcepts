package com.workspace.array;

public class Array1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        // for loop
        for (int i = 0; i < a.length; i++) {   // value of length = 6
            System.out.println(a[i]);
        }

        // for each
        for (Integer i : a){
            System.out.println(i);
        }

    }
}
