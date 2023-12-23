package com.workspace.string;

public class BubbleSort {
    public static void main(String[] args) {
        String[] name = {"Prince", "Rahul", "Priya", "Ram", "Akash"};
        String temp;

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    temp = name[j + 1];
                    name[j + 1] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
