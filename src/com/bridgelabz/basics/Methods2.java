package com.bridgelabz.basics;

// static and non-static methods, calling in same and different class

public class Methods2 {

    static void m1(){  // static method of void type
        System.out.println("m1 static method");
    }

    void m2(){    // non-static method of void type
        System.out.println("m2 non-static method");
    }

    public static void main(String[] args) {

        // in same class, static method calls directly
        m1();

        // in same class, non-static method calls by creating class object and then call through the object
        Methods2 methods2 = new Methods2();
        methods2.m2();
    }
}
class Test2{
    public static void main(String[] args) {

        // in different class, static method calls by class name
        Methods2.m1();

        // in different or same class, the calling process of non-static method is same
        Methods2 methods2 = new Methods2();
        methods2.m2();
    }
}
