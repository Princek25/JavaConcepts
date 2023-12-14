package com.workspace.exception_handling;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[7] = 9;  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
