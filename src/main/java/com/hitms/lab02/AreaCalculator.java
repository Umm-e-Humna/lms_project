package com.hitms.lab02;

public class AreaCalculator {

    /** Returns the area of a rectangle. */
    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        int result = calculateArea(10, 5);
        System.out.println("Area of rectangle: " + result);
    }
}