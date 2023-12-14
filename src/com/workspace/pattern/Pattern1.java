package com.workspace.pattern;

public class Pattern1 {

    public static void pattern1(int n) {
        for (int rows = 1; rows <= n; rows++) {    // no. of line = n
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
/*

 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

 */