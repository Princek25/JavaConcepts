package com.workspace.array;

public class Print2DArray {

    public static void print2DArray() {

        // jagged 2d array
        System.out.println("jagged 2d array.... ");
        int[][] a = {{10, 20, 30, 40}, {50, 60}, {70, 80, 90}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // matrix 2d array
        System.out.println("matrix 2d array....");
        int[][] b = {{10,20,30},{40,50,60},{60,70,80}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print2DArray();
    }
}
