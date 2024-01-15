package com.workspace.string_basics;

public class ManipulateAString {
    public static void main(String[] args) {
        String name = "Prince";
        for (int i = 0; i < name.length(); i++) {
            if (i == 3){
                System.out.print(" ");
            }
            System.out.print(name.charAt(i));
        }
    }
}
