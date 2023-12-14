package com.workspace.pattern;

public class Pattern7 {

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern7(5);
    }
}
/*

12345
12345
12345
12345
12345

 */