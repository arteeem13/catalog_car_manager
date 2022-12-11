package com.andreev;

public class CityCar extends Car {

    private String model;
    private double price;
    private int capacity;

    public CityCar(String model, double price, int capacity) {
        this.model = model;
        this.price = price;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
