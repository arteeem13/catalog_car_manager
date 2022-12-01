package com.github.arteeem13;

public class CityCar extends Car {

    private int capacity;

    public CityCar(String model, int price, int capacity) {
        super(model, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
