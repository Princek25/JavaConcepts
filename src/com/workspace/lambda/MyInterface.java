package com.workspace.lambda;

// Functional interface has only one abstract method.
// Annotation - @FunctionalInterface
// how to use functional interface -
// 1. create a separate class(MyClass) and implements this interface(MyInterface)
// 2. anonymous class for implementing interface
// 3. use Lambda expression

@FunctionalInterface
public interface MyInterface {
    public abstract void sayHello();
}
