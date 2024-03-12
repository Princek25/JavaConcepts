package com.workspace.array_int_1d;

import java.util.Scanner;

public class LargestElement {

    public static void largestElement() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of element you want to store: ");
        n = sc.nextInt();
        int[] a = new int[10];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("The largest element is: " + max);
    }

    public static void main(String[] args) {
        largestElement();
    }
}
