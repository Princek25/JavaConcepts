package com.workspace.fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// PrintWriter is recommended instead of FileWriter and BufferedWriter

public class PrintWriter1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.write(100);
        pw.println(100);
        pw.println(true);
        pw.println('c');
        pw.println(125.64);
        pw.println("Prince");
        pw.flush();
        pw.close();
    }
}
