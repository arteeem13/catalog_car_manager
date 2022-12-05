package com.andreev;

public class RacingCar extends Car {
    private double maxSpeed;

    public RacingCar(String model, int price, int maxSpeed) {
        super(model, price);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
