package com.vdabmao2018.lessen.les7;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height) {
        this.height = height;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double area() {
        double area = this.height * this.width;
        return area;
    }

    public double perimeter() {
        double perimiter = 2 * this.height + 2 * this.width;
        return perimiter;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {
        return width;
    }
}
