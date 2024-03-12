package com.workspace.advanced_questions;

// Armstrong number = 0,1,153,370,371,407,1634
// 153 = 1^3 + 5^3 + 3^3

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;      // 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        int temp1 = n;
        int temp2 = n;
        int length = 0;
        int rem;
        int add = 0;

        while (temp1 != 0) {
            length++;
            temp1 = temp1 / 10;
        }

        while (temp2 != 0) {
            int mul = 1;
            rem = temp2 % 10;  // 3  // 5  // 1
            for (int i = 1; i <= length; i++) {
                mul = mul * rem; // 3*3*3 = 27 // 5*5*5 = 125 // 1*1*1 = 1
            }
            add = add + mul; // 27 // 125 + 27 = 152 // 152 + 1 = 153
            temp2 = temp2 / 10; // 15  // 1 // 0
        }
        if (add == n) {
            System.out.println("The number is armstrong");
        } else System.out.println("The number is not armstrong");
    }
}
