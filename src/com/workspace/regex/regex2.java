package com.workspace.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {

        String text = "hi welcome to java program";
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
