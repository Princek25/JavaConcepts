package com.workspace.string_basics;

public class RemoveWhiteSpaces {

    public static void inBuiltMethod(){
        String str = "Hi how are you";
        System.out.println(str.replaceAll("\\s", ""));
        System.out.println(str.replace(" ", ""));
    }
    public static void method2(){
        String str = "Hi how are you";

    }

    public static void main(String[] args) {
        inBuiltMethod();
    }
}
