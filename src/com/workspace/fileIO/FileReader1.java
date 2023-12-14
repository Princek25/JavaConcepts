package com.workspace.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) throws IOException, IOException {

        // read();
        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();

        // read(char[] ch);
        File f = new File("abc.txt");
        FileReader fr1 = new FileReader(f);
        char[] ch = new char[(int)f.length()];
        fr1.read(ch);
        for (char ch1 : ch){
            System.out.print(ch1);
        }
    }
}
