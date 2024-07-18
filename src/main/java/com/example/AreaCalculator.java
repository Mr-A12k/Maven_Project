package com.example;

public class AreaCalculator {

    // Method to calculate the area of a rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

