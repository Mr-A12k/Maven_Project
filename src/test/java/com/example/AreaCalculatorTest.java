package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AreaCalculatorTest {

    @Test
    public void testRectangleAreaInbuiltValues() {
        double length = 5.0;
        double width = 3.0;
        double expected = 15.0;
        assertEquals(expected, AreaCalculator.rectangleArea(length, width), 0.0001);
    }

    @Test
    public void testRectangleAreaUserValues() {
        double length = 7.5;
        double width = 4.2;
        double expected = 31.5;
        assertEquals(expected, AreaCalculator.rectangleArea(length, width), 0.0001);
    }

    @Test
    public void testTriangleAreaInbuiltValues() {
        double base = 4.0;
        double height = 6.0;
        double expected = 12.0;
        assertEquals(expected, AreaCalculator.triangleArea(base, height), 0.0001);
    }

    @Test
    public void testTriangleAreaUserValues() {
        double base = 8.0;
        double height = 5.0;
        double expected = 20.0;
        assertEquals(expected, AreaCalculator.triangleArea(base, height), 0.0001);
    }

    @Test
    public void testCircleAreaInbuiltValues() {
        double radius = 3.0;
        double expected = 28.274333882308138;
        assertEquals(expected, AreaCalculator.circleArea(radius), 0.0001);
    }

    @Test
    public void testCircleAreaUserValues() {
        double radius = 4.5;
        double expected = 63.61725123519331;
        assertEquals(expected, AreaCalculator.circleArea(radius), 0.0001);
    }
}
