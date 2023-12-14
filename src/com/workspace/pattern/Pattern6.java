package com.workspace.pattern;

public class Pattern6 {

    static void pattern6(int n){
        for (int i = 1; i<=n; i++){
            for (int j = n-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int k= 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern6(5);
    }
}
/*

     *
    * *
   * * *
  * * * *
 * * * * *

 */