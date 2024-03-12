package com.workspace.pattern;

/* Right half pyramid

 *
 * *
 * * *
 * * * *
 * * * * *

 */
public class Pattern2 {
    public static void pyramid1(int n){
        for (int i = 1; i <= n; i++){
            // for every row run the col
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid1(5);
    }
}
