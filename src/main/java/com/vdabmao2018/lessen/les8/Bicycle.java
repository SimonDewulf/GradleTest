package com.vdabmao2018.lessen.les8;

public class Bicycle extends Transport {
    public Bicycle(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void move() {
        System.out.println(" ride my BIIIICYCLE");
    }

}
