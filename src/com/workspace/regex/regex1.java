package com.workspace.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher("h");
        if (matcher.matches()){
            System.out.println("Pattern matched successfully");

        }
        else System.out.println("Invalid input");
    }
}
