package com.workspace.collection_framework;

import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {

        Stack s = new Stack();

        // push()
        s.push("deepak");
        s.push("amit");
        s.push(200);
        s.push(101.01); // topmost element is 101.01 here

        System.out.println(s);

        // isEmpty()
        System.out.println(s.isEmpty());

        // pop()
        s.pop();
        System.out.println(s);

        // peek()
        System.out.println(s.peek());

        // search()
        System.out.println(s.search("amit")); // if it does not match then returns -1
    }
}
