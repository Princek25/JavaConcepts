package com.workspace.programs;

// sum of odd number by using for and while loop
public class OddNumber1 {
    public static void main(String[] args) {
        for (int i = 1; i< 50; i++){
            if (i %2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int i = 1;
        int sum = 0;
        while (i < 50){
            if (i % 2 != 0 ){
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
