package com.workspace.collection_framework;

import java.util.TreeSet;

// 1. TreeSet does not allow different types of data types (Heterogeneous)
// 2. TreeSet follows sorting order

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(56);
        ts.add(68);
        ts.add(26);
        ts.add(59);
        ts.add(43);

        System.out.println(ts); // it will print in ascending order.

        TreeSet ts1 = new TreeSet<>();
        ts1.add("deepak");
        ts1.add("amit");
        ts1.add("sam");
        ts1.add("peter");
        System.out.println(ts1); // it will print in dictionary order.
    }
}
