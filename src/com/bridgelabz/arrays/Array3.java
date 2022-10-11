package com.bridgelabz.arrays;

// 2D Array:
// Declaration:     int [][] a;
// Creation:        a = new int [2][3];
// Initialisation:  a [0][0] = 10;


public class Array3 {
    public static void main(String[] args) {

        int [][] a = new int[2][3];  // (declaration + creation)
        a [0][0] = 10;              // (initialisation)
        a [0][1] = 20;              // (initialisation)
        a [1][0] = 30;              // (initialisation)
        a [1][1] = 40;              // (initialisation)

        // Instead of doing that you can do this
        int [][] b = {{10,20,30,40}, {50,60}, {70,80,90}};   // (declaration + creation + initialisation)

        // printing 2d arrays:
        System.out.println("printing 2d arrays:");
        for (int i=0;i< a.length;i++) {
            for (int j=0;j< a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // printing 2d arrays:
        System.out.println("printing 2d arrays:");
        for (int i=0;i< b.length;i++) {
            for (int j=0;j< b[i].length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
