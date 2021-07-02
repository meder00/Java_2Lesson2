package com.geektech;

public  abstract class Figure implements Draw {
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int calculatePerimeter();

}
