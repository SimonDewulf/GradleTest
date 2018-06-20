package com.vdabmao2018.lessen.les7;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {

        double area = (base * height) / 2;
        return area;
    }

    public double perimeter() {
        double perimiter = base + Math.sqrt(base * base + 4 * height * height);
        return perimiter;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
