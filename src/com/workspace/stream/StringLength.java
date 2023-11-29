package com.workspace.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// compare the string according to their length.

public class StringLength {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Steve Roger");
        name.add("Peter Parker");
        name.add("Tony Stack");
        name.add("Scott Lang");
        name.add("Natasha Romanoff");

        // lambda expression
        Comparator<String> c = (s1,s2)-> {
            int l1 = s1.length();
            int l2 = s2.length();
            if (l1<l2) return -1;
            else if (l2<l1) return 1;
            else return s1.compareTo(s2);};

        List<String> l = name.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l);
    }
}
