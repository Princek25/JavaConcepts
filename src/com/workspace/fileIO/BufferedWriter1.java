package com.workspace.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt"); // BufferedWriter can't communicate directly to file.
        BufferedWriter bw = new BufferedWriter(fw);
        fw.write(101);
        bw.newLine();
        char[] ch = {'a', 'b', 'c'};
        bw.newLine();
        bw.write("durga");
        bw.newLine();
        bw.write("software solution");
        bw.flush();
        bw.close();
    }
}
