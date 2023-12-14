package com.workspace.exception_handling;

public class ArithmeticException1 {
    public static void main(String[] args) {   // abnormal termination
        doStuff();
    }

    public static void doStuff() {       // abnormal termination
        doMoreStuff();
        System.out.println(10 / 0);
    }

    public static void doMoreStuff() {      // normal termination
        System.out.println("Hello");
    }
}
