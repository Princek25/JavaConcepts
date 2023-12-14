package com.workspace.pattern;

public class Pattern2 {
    public static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            // for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
/*

 *
 * *
 * * *
 * * * *
 * * * * *

 */