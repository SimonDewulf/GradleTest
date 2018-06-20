package com.vdabmao2018.lessen.les8;

public class Airplane extends Transport {

    public Airplane(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void move() {
        System.out.println("fly");
    }


}
