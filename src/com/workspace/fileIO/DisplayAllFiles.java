package com.workspace.fileIO;

import java.io.File;

// Display all the files and count the number of files are there.

public class DisplayAllFiles {

    public static void main(String[] args) {

        int count = 0;
        File f = new File("C:\\New Folder");
        String[] s = f.list();
        for (String s1 : s) {  // for each string s1 in s
            count++;
            System.out.println(s1);
        }
        System.out.println("The total number: " + count);
    }
}
