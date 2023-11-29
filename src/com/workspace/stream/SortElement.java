package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Sort the element (ascending order)

public class SortElement {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(34);
        al.add(17);
        al.add(13);
        al.add(12);
        al.add(19);
        System.out.println(al);

        List<Integer> sort = al.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
    }
}
