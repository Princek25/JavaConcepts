package com.workspace.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Amit");
        pq.add("Vijay");
        pq.add("Karan");
        pq.add("Akash"); // highest priority (head)
        pq.add("Jai");
        pq.add("Rahul");

        System.out.println("head: " + pq.element());
        System.out.println("head: " + pq.peek());

        System.out.println("iterating the queue elements");

        Iterator<String> itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        pq.remove();
        System.out.println("-----" + pq);
        pq.poll();

        System.out.println("after removing two elements");

        Iterator<String> itr2 = pq.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
