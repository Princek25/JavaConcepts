package com.workspace.array_int_2d;

import java.util.Scanner;

public class UserInput2DArray {

    public static void takingUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int col = sc.nextInt();

        // declaration + creation of matrix 2d array
        int[][] inputArr = new int[row][col];

        // for user input
        System.out.println("Enter the elements: ");
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }
        // for printing --> same for loop as above but here you have to print
        System.out.println("The elements are: ");
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                System.out.print(inputArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        takingUserInput();
    }
}
