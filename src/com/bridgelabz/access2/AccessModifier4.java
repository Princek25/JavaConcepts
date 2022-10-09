package com.bridgelabz.access2;

import com.bridgelabz.access1.AccessModifier1;

public class AccessModifier4 extends AccessModifier1 {
    public static void main(String[] args) {

        // outside the package with inheritance
        AccessModifier4 accessModifier1 = new AccessModifier4();
     // System.out.println(accessModifier1.a);  // default (X)
        System.out.println(accessModifier1.b);  // public
     // System.out.println(accessModifier1.c);  // private (X)
        System.out.println(accessModifier1.d);  // protected
    }
}
