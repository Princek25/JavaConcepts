package com.bridgelabz.basics;

// Methods - Static and Non-Static

public class Methods {

    static void m1Void(){ // Static method of void type(return nothing)
        System.out.println("Static Methods of void type");
    }

    static int m2Int(){  // static method of integer type(always return integer value)
        return 5;
    }

    static boolean m3Boolean(){  // static method of boolean type(always return true or false)
        return true;
    }

    static double m4Double(){  // static method of double type(always return double value)
        return 5.67;
    }


    public static void main(String[] args) {
        m1Void(); // method calling for void type

        int i = m2Int();      // method calling for int type method
        System.out.println(i);

        boolean b = m3Boolean();// method calling for boolean type
        System.out.println(b);

        double d = m4Double(); // method calling for double type
        System.out.println(d);
    }
}
class Methods2{
    public static void main(String[] args) {
        Methods.m1Void();

    }

}
