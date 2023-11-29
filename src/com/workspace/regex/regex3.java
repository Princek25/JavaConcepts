package com.workspace.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex3 {
    public static void main(String[] args) {
        String text = "WelcomeABC, WelcomeB, WelcomeC";
        Pattern pattern = Pattern.compile("Welcome."); // . regex
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
