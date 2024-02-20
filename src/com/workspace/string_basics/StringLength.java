package com.workspace.string_basics;
// Length of the string without using strlen() function
public class StringLength {
    public static void main(String[] args) {
        String name = "Prince";
        int length = 0;

        for (char c : name.toCharArray()){
            length++;
            System.out.println(c);
        }
        System.out.println(length);
    }
}
