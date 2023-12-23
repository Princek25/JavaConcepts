package com.workspace.array;

public class LargeElement {
    public static void main(String[] args) {
        int[] a = {10, 23, 12, 26, 53, 45};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("The largest element is: " + max);
    }
}
