package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(34);
        al.add(17);
        al.add(13);
        al.add(12);
        al.add(19);
        System.out.println(al);

        // print the even number of the collection - filter()

        List<Integer> al2 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(al2);

        // add 5 to all the collection object - map()

        List<Integer> al3 = al.stream().map(i-> i+5).collect(Collectors.toList());
        System.out.println(al3);

        // list all the number which is more than 15

        List<Integer> al4 = al.stream().filter(i-> i>15).collect(Collectors.toList());
        System.out.println(al4);

    }
}
