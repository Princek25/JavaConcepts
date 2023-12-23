package com.workspace.pattern;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
