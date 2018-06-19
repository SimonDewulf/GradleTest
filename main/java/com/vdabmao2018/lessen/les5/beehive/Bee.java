package com.vdabmao2018.lessen.les5.beehive;

public class Bee {
    private String name;

    public Bee(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println(name + " takes off into the air, leaving the world behind on a voyage to the distant sun and sky");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
