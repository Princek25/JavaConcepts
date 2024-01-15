package com.workspace.basic_questions;

public class Inc_Dec_Op {

    public static void incrementOperators(){

        // pre-increment -> no tension (just add 1)
        // post-increment -> 2 step -> print the original value then increment in air

        int a = 10;
        int b = 15;
        System.out.println(a++ + ++a + ++a + a++ + a++ + ++a); //  add
        // 10 + 12 + 13 + 13 + 14 + 16 = 78

        // concatenate ->
        System.out.println(b++ + " " + ++b + " " + ++b + " " + b++ + " " + b++ + " " + ++b);
        // 15, 17, 18, 18, 19, 21
    }

    public static void main(String[] args) {
        incrementOperators();
    }
}
