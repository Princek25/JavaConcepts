package com.workspace.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public static void main(String[] args) {

        String phoneNo = "8835845891";
        Pattern pattern = Pattern.compile("[6789]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(phoneNo);

        if (matcher.matches()){
            System.out.println("The phone number is matched");
        }
        else System.out.println("Invalid phone");
    }
}
