package com.workspace.basic_questions;

import java.util.Scanner;

public class VowelNConsonant {

    public static void checkVowel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet character:- ");
        char c = sc.next().charAt(0);
        switch (c){
            case 'a' , 'A', 'e' , 'E', 'i' , 'I', 'o' , 'O', 'u' , 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        checkVowel();
    }
}
