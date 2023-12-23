package com.workspace.programs;

public class LeapYear {
    public static void main(String[] args) {
        leapYear(1600);
    }

    public static void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year " + year + " is a leap year");
        }
        else System.out.println("The year " + year + " is not a leap year");
    }
}
