package com.workspace.array_int_2d;

public class Print3DArray {

    public static void print3DArray() {
        int[][][] a = {{{10, 20}, {30, 40, 50, 60}, {70, 80, 90}}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print3DArray();
    }
}
