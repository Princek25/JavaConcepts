package com.workspace.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts....");

        // using functional interface by creating a class (MyClass)
        MyInterface in1 = new MyClass();
        in1.sayHello();

        // using functional interface by anonymous class - a class without name
        MyInterface in2 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("This is my first anonymous class");
            }
        };
        in2.sayHello();

        // using our interface with the help of lambda
        MyInterface in3 = () -> {
            System.out.println("This is first time i am using lambda");
        };
        in3.sayHello();

        // lambda expression

        SumInterface si = (int a, int b) -> {
            return a + b;
        };
        System.out.println(si.sum(5, 6));
        System.out.println(si.sum(6, 9));

        // find the length of the string using lambda

        LengthInterface li = (str -> str.length());
        System.out.println("The length of the string is: " + li.getLength("Prince"));
    }
}
