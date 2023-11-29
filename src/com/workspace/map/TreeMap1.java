package com.workspace.map;

import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {

        // treemap follows sorting order
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(106, "deepak");
        tm.put(103, "amit");
        tm.put(107, "prince");
        tm.put(102, "karan");
        tm.put(101, "ravi");

        System.out.println(tm);

        // methods
        System.out.println(tm.ceilingEntry(105));  // equal if available, if not then greater value
        System.out.println(tm.ceilingKey(105));
        System.out.println(tm.containsKey(105));
        System.out.println(tm.firstEntry());
        System.out.println(tm.floorEntry(105));
        System.out.println(tm.get(104));
        System.out.println(tm.headMap(102));
        System.out.println(tm.higherEntry(102));
        System.out.println(tm.keySet());

    }
}
