package com.vdabmao2018.lessen.les8;

public class Car extends Transport {

    public Car(String name, String brand) {
        super(name, brand);
    }

    public void move(){
        System.out.println("drive");
    }
}
