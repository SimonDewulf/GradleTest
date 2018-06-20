package com.vdabmao2018.lessen.les8;

public class Truck extends Transport {
    private int capacity;

    public Truck(String name, String brand, int capacity) {
        super(name, brand);
        this.capacity = capacity;
    }

    @Override
    public void move() {
        System.out.println("drive truck");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}


