package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// sort the element in descending order

public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(34);
        al.add(17);
        al.add(13);
        al.add(12);
        al.add(19);
        System.out.println(al);

        // compare
        List<Integer> l = al.stream().sorted((i1,i2)-> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(l);
    }
}
