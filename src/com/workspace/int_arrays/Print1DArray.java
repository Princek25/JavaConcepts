package com.workspace.int_arrays;

public class Print1DArray {

    public static void print1DArray1(){
        int[] a = {10, 20, 30, 40, 50};
        // index    0   1   2   3   4
        // for loop
        for (int i = 0; i < a.length; i++) {   // a.length = 5
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // for each
        for (Integer i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // array in method argument
    public static void print1DArray2(int[] arr){
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print1DArray1();
        print1DArray2(new int[]{10,23,56,45,56});
    }
}
