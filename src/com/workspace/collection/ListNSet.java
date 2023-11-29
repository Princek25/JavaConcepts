package com.workspace.collection;

// Difference between List and Set -
// 1. list follow insertion order but set does not follow insertion order.
// 2. list allow duplicate element but set does not allow duplicate element.
// 3. list can store multiple null values but set can store only one null value.

import java.util.*;

public class ListNSet {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();  // we cannot create object of list interface
        l.add(21);
        l.add(74);
        l.add(45);
        l.add(12);
        l.add(12);
        l.add(null);
        l.add(null);
        System.out.println(l); // the order of print 21 74 45

        Set<Integer> s = new HashSet<>();
        s.add(21);
        s.add(74);
        s.add(45);
        s.add(12);
        s.add(12);      // it will not print this
        s.add(null);
        System.out.println(s); // the order of print is not like - 21 74 45 12
        System.out.println("-------------------");

        // for iterating one by one element from the list and set

        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("-------------------");

        Iterator<Integer> itr2 = s.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
