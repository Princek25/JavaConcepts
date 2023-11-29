package com.workspace.polymorphism;

public class Student {
    public void read(){
        System.out.println("Reading XYZ book");
    }

    public void read(String BookName){
        System.out.println("Reading " + BookName + "Book");
    }
}
// Method Overloading - the name of the method is same but the parameters are different.
// Compile time polymorphism because the object are bound to their functionality at
// compile time.