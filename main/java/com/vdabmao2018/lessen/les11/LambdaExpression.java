package com.vdabmao2018.lessen.les11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("bluh", "bluh", "bluh"));
        people.add(new Person("blah","blah","blah"));
        people.add(new Person("bloh","bloh","bloh"));



        //this avoids making a personcomparator class as I've done below anyway
        //dit heet een anonymous inner class => niet herbruikbaar, de moeite niet om een java file voor te maken


        Comparator<Person> a = new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {                        //uitgebreide optie
                return a.getName().compareTo(b.getName());
            }
        };



        //Lambda Optie 1
        Comparator<Person> b = (Person a1, Person b1) -> {
            return a1.getName().compareTo(b1.getName());
        };

        //Lambda Optie 2
        Comparator<Person> c = ( a1, b1) -> {
            return a1.getName().compareTo(b1.getName());
        };

        //Lambda Optie 3  => enkel voor single statements binnen de compare method.
        Comparator<Person> d = (a1, b1) -> a1.getName().compareTo(b1.getName());




        Comparator<Person> e = Comparator.comparing(Person::getName);

        //dit werkt alleen op interfaces die maar 1 method hebben. anders weet ie niet welke te gebruiken

        people.sort(e);



        for (Person person : people) {
            System.out.println(person.name);
        }
    }
}



class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {   //werkt alleen op
        return o1.getName().compareTo(o2.name);
    }
}





class Person implements Comparable<Person>{   //Comparable is een SAM(Single Abstract Method) heeft dus maar 1 method
                                                //wordt in java ook wel Functional method genoemd
    String name;
    String age;
    String adress;

    public Person(String name, String age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }


    @Override
    public int compareTo(Person that) {  //==> the "that" moet vergeleken worden met the "this"
        return this.name.compareTo(that.name); //compareTo hier is de implementatie van String => premade method
        //returns an int. positive if this is greater than that, negative if this is smaller than that, 0 if equal.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
