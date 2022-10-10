package com.bridgelabz.arrays;

// Array 1D: - Array should be in method
// Declaration of array: int [] a;
// Creation of array: a = new int[3];
// int [] a = new int[3];  (declaration + creation)
// When we create an array it provides default value
// Insert value in array: a [0] = 10; (initialisation)

public class Array2 {

    public static void main(String[] args) {
        int [] a = new int [3];    // (declaration + creation) of array
        a [0] = 10;                // (initialisation) = insert some value in array
        a [1] = 20;
        a [2] = 30;
        // instead of doing that you can use

        int [] b = {40,50,60};  // (declaration + creation + initialisation) in one line

        // printing 1D Array a
        System.out.println("Printing 1d array");
        for (int i=0;i< a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();   // next line

        // printing 1D Array b
        for (int i=0;i< b.length;i++) {
            System.out.print(b[i] + " ");
        }
    }

}
