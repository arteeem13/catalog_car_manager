package com.andreev;

public class RacingCar extends Car {

    private String model;
    private double price;
    private double maxSpeed;

    public RacingCar(String model, double price, double maxSpeed) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
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
