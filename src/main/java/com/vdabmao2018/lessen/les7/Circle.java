package com.vdabmao2018.lessen.les7;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() {

        double area = radius * radius * Math.PI;
        return area;
    }

    public double perimeter() {
        double perimiter = radius * 2 * Math.PI;
        return perimiter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }
}
