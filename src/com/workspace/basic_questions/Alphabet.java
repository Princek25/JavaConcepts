package com.workspace.basic_questions;

// ASCII Code:- A-Z = 65-90 and a-z = 97-122

public class Alphabet {

    public static void checkAlphabetM1(char c) {
        if (c >= 'a' && c <= 'z') {
            System.out.println("Yes it is an alphabet");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Yes it is an alphabet");
        } else System.out.println("No! it is not an alphabet");
    }
    public static void checkAlphabetM2(char c) {
        if (c >= 97 && c <= 122) {
            System.out.println("Yes it is an alphabet");
        } else if (c >= 65 && c <= 90) {
            System.out.println("Yes it is an alphabet");
        } else System.out.println("No! it is not an alphabet");
    }

    public static void main(String[] args) {
        checkAlphabetM1('a');
        checkAlphabetM2('2');
    }
}
