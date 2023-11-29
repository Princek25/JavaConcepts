package com.workspace.exception;

public class ExceptionHandling1 {
    public static void main(String[] args) {
//        String str = null;
//        System.out.println(str.length()); // NullPointerException
        try {
            int a = 30, b = 0;
            int  c = a/b;           // ArithmeticException
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("you cant divide a number by zero");
        }
    }
}
