package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Q. create a list and add 100 to all the list, without stream or with stream

public class AddNumber {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(125);
        al.add(133);
        al.add(240);
        al.add(156);
        al.add(162);
        al.add(123);

        // without stream
        for (Integer i : al) {
            i = i + 100;
            System.out.println(i);
        }

        // with stream
        List<Integer> l = al.stream().map(i -> i + 100).collect(Collectors.toList());
        System.out.println(l);

    }
}
