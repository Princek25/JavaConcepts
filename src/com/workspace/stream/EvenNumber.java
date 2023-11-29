package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Q. Create a list and filter all the even number from the list without stream and with
//    stream.

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(13);
        al.add(20);
        al.add(16);
        al.add(12);
        al.add(13);

        // without stream
        for (Integer integer : al) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        // with stream
        List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l);
    }
}
