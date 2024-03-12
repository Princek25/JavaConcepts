package com.workspace.basic_questions;

import java.util.Scanner;

public class TriangleArea {

    public static void areaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        int area = (base * height)/2;
        System.out.println("The area of Triangle is: " + area);
    }

    public static void main(String[] args) {
        areaOfTriangle();
    }
}
