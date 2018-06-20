package com.vdabmao2018.lessen.les7;

import java.text.DecimalFormat;


//making a class abstract makes it impossible to instantiate
//also makes it possible to make abstract methods => this is a partial implementation
//methods in abstract classes don't HAVE to be abstract. when they aren't the normal override rules apply
//=> eg: more specific methods will still override, and higher methods will still be able to be generalised.
public abstract class Shape {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.00");

        Shape O = new Circle(3);
        System.out.println("oppervlakte = " + df.format(O.area()) + "m^2");
        System.out.println("omtrek = " + df.format(O.perimeter()) + "m");


        Shape rect = new Rectangle(5, 5);
        System.out.println("oppervlakte = " + df.format(rect.area()) + "m^2");
        System.out.println("omtrek = " + df.format(rect.perimeter()) + "m");

        Shape a = new Triangle(5, 10);
        System.out.println("oppervlakte = " + df.format(a.area()) + "m^2");
        System.out.println("de kleinst mogelijke omtrek = " + df.format(a.perimeter()));

    }


    //abstract methods really only indicate that subclasses will have a more specific instance of the method. => it forces every subclass to have an "area" and "perimeter" method
    // => ELKE subclasss van Shape moet een area() en perimiter() hebben OF die subclasse moet zelf ook abstract zijn, maar dan moeten ZIJN subclasses het hebben.
    //dit is GEEN OVERRIDE: een override overschrijft de functie van de hogere klasse met een beter geschikte
    //dit is een openstelling voor verschillende implementaties.
    public abstract double area();

    //zowel the return type als de parameters moeten gerespecteerd worden in de subclasses => dwz in dit geval moet elke method in de subclasses die "area()" heet een double returnen én geen parameters hebben

    public abstract double perimeter();
}
