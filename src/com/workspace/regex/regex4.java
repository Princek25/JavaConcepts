package com.workspace.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex4 {
    public static void main(String[] args) {

        String input = "Hello1";
        Pattern pattern = Pattern.compile("[A-Za-z]+[0-9]");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("The pattern matched");
        }
        else System.out.println("The pattern is not matched");

    }
}
