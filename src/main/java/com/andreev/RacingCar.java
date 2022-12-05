package com.andreev;

public class RacingCar extends Car {
    private double maxSpeed;

    public RacingCar(int maxSpeed) {
        super();
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
