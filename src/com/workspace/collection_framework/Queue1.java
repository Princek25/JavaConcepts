package com.workspace.collection_framework;

// Queue is an interface, we cannot create an object

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(172);
        pq.add(143);
        pq.add(134);
        pq.add(145);

        System.out.println(pq);

        Queue<Integer> pq1 = new PriorityQueue<>();

        pq1.add(172);
        pq1.add(143);
        pq1.add(134);
        pq1.add(145);

        System.out.println(pq1);


        // peek() - it show the top element which is 12
        //System.out.println(pq.peek());

    }
}
