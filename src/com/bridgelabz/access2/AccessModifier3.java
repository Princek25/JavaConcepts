package com.bridgelabz.access2;

import com.bridgelabz.access1.AccessModifier1;

public class AccessModifier3 {

    public static void main(String[] args) {

        // outside the package:
        // getting access of AccessModifier1 class
        AccessModifier1 accessModifier1 = new AccessModifier1();
     // System.out.println(accessModifier1.a);  // default X
        System.out.println(accessModifier1.b);  // public
     // System.out.println(accessModifier1.c);  // private X
     // System.out.println(accessModifier1.d);  // protected X
    }
}
