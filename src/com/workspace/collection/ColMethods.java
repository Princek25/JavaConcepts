package com.workspace.collection;

import java.util.ArrayList;

public class ColMethods {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        // add(object e)
        al.add(10);
        al.add("Prince");
        al.add("Rahul");
        al.add("Pankaj");
        al.add(768);
        System.out.println(al);

        ArrayList al2 = new ArrayList<>();
        al2.add(456);
        al2.add('C');

        // addAll(Collection <?> c)  -> add two collections -------------------
        al.addAll(al2);
        System.out.println(al);

        // remove(Object 0) -----------------------------------------------
        al.remove("Pankaj");
        System.out.println(al);

        // removeAll(Collection <?> c) -> remove second collection -----------------------------
        al.removeAll(al2);
        System.out.println(al);

        // size() - return type is int -------------------------------------------
        int i = al.size();
        System.out.println(i);

        // contains(Object element) -------------------------------------------
        System.out.println(al.contains(768));

        // isEmpty()---------------------------------------------------------------------------
        System.out.println(al.isEmpty());

        // clear() ------------------------------------------------------------------
        al.clear();
        System.out.println(al);
    }
}
