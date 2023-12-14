package com.workspace.pattern;

public class Pattern5 {

    public static void pattern5(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int t = i > n ? 2 * n - i - 1 : i;
            for (int j = 1; j <= t; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5(4);
    }
}
/*

 *
 * *
 * * *
 * * * *
 * *
 *

 */