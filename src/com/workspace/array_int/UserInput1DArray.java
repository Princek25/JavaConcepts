package com.workspace.array_int;

import java.util.Scanner;

public class UserInput1DArray {

    public static void takingUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int no = sc.nextInt();
        System.out.println(no);
        int[] inputArr = new int[no];
        // to insert element from the user we need for loop
        System.out.println("Enter the elements: ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
        // to print an array we need a for loop
        System.out.println("The elements are: ");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        takingUserInput();
    }
}
