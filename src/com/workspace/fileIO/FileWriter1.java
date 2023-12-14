package com.workspace.fileIO;

import java.io.FileWriter;
import java.io.IOException;

// the location is your project location JavaConcepts folder

public class FileWriter1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(100);  //d
        fw.write("urga\nSoftware Solution");   // \n -> new line
        fw.write('\n');
        char[] ch = {'a', 'b', 'c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
    // if it runs again it will perform override to append we need different constructor.
    // override - replace the data each time you run.
    // append - add the data in the new line each time you run.
    // FileWriter fw = new FileWriter("abc.txt", true);
}
