package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;

// find the minimum and maximum element of the list

public class MinAndMax {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(13);
        al.add(20);
        al.add(16);
        al.add(12);
        al.add(13);

        // lambda method
        Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);

        Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);
    }
}
