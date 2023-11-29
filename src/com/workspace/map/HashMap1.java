package com.workspace.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "deepak"); // key and value
        map.put(102, "amit");
        map.put(103, "rahul");
        map.put(104, "kamal");

        System.out.println(map);

        // retrieve element one by one

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // retrieve element one by one

        for (Map.Entry me: map.entrySet()
             ) {
            System.out.println(me.getKey() + " -> " + me.getValue());
        }
    }
}
