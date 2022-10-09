package com.bridgelabz.basics;

// Creating Static, non-static, local variables and call the variable in same or different class.

public class Variables {
    static int a = 10;   // Static variables are used for memory management / saving memory
    static int b = 20;
    int c = 30;         // Instance variables / non-static variable
    int d = 40;

    public static void main(String[] args) {
        int e = 50;                  // local variable - always inside the method and calls directly
        System.out.println(a);       // In same class - static variable calls - (directly)
        Variables obj = new Variables();
        System.out.println(obj.c);   // In same class - instance variable calls through - creating
                                     // class object and call through (object name.instance variable name)
        System.out.println(e);       // local variable cannot call outside the method
    }
}
class Test1 {
    public static void main(String[] args) {
        System.out.println(Variables.b);  // In different class - static variable calls through -
                                          // (class name.static variable name)
        Variables obj = new Variables();
        System.out.println(obj.d);        // In different class or same class - the process of calling
                                          // instance variables are same
    }

}
