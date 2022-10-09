package com.bridgelabz.access1;

public class AccessModifier2 {
    public static void main(String[] args) {

        // outside the class:
        // getting access of AccessModifier1 class
        AccessModifier1 accessModifier1 = new AccessModifier1();
        System.out.println(accessModifier1.a);  // default
        System.out.println(accessModifier1.b);  // public
     // System.out.println(accessModifier1.c);  // private X
        System.out.println(accessModifier1.d);  // protected
    }
}
