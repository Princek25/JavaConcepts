package com.workspace.basic_question;

// check a year is leap is or not but the year should be not more than 4 digit.

public class LeapYear {

    public static void checkLeapYear(int year) {
        if (year < 10000 && year > 0) {
            if (year % 400 == 0) {
                System.out.println("The year is leap year");
            } else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("The year is leap year");
            } else System.out.println("The year is not a leap year");
        }
        else System.out.println("Enter a valid year!..");
    }

    public static void main(String[] args) {
        checkLeapYear(1540);
    }
}
