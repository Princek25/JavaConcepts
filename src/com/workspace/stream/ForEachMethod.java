package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Print all the element one by one, by using for each method

public class ForEachMethod {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(34);
        al.add(17);
        al.add(13);
        al.add(12);
        al.add(19);

        // for each loop
        for (Integer i : al) {
            System.out.println(i);
        }

        // forEach Method
        al.forEach(System.out::println);
        System.out.println("---------------------");

        // squared of all the element by using forEach()
        Consumer<Integer> c = i -> {
            System.out.println("The square root of " + i + " is: " + i * i);
        };
        al.forEach(c);
    }
}
