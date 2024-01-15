package com.workspace.basic_questions;

public class Temperature {

    public static void fahrenheitToCelsius(float f) {
        float c = ((f - 32) * 5) / 9;
        System.out.println("Celsius: " + c);
    }

    public static void celsiusToFahrenheit(float c) {
        float f = (9 * c) / 5 + 32;
        System.out.println("Fahrenheit: " + f);
    }

    public static void main(String[] args) {
        fahrenheitToCelsius(64);
        celsiusToFahrenheit(97);
    }

}
