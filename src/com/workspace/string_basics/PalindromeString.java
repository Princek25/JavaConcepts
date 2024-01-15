package com.workspace.string_basics;

public class PalindromeString {

    public static void method1(String input) {
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        if (rev.equals(input)) {
            System.out.println("Yes it is a palindrome string");
        } else System.out.println("No it is not a palindrome string");
    }

    public static void method2(String input) {
        String rev = "";
        int i = 0;
        while (i < input.length()) {
            rev = input.charAt(i) + rev;
            i++;
        }
        if (rev.equals(input)) {
            System.out.println("Yes it is a palindrome string");
        } else System.out.println("No it is not a palindrome string");
    }

    public static void main(String[] args) {
        method1("madam");
        method2("apple");
    }
}
