package com.workspace.fileIO;

import java.io.File;
import java.io.IOException;

public class FileIODemo {

    public static void main(String[] args) throws IOException {

        // how to create a file
        File f = new File("abc.txt"); // this line won't create a physical file
        System.out.println(f.exists());
        f.createNewFile();              // to create physical file
        System.out.println(f.exists());

        // how to create a directory
        File f1 = new File("durga123");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());

        File f2 = new File("C:\\New Folder", "abc.txt");
        System.out.println(f2.exists());
        f2.createNewFile();
        System.out.println(f2.exists());
    }
}
