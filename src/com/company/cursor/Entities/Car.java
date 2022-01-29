package com.company.cursor.Entities;

import com.company.cursor.CarType;
import com.company.cursor.Engines.Engine;

public  class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final String model;
    private final boolean tripComputer;
    private final boolean GPS;
    private final boolean onBoardComputer;

    public Car(CarType carType, int seats, Engine engine, String model, boolean tripComputer, boolean GPS, boolean onBoardComputer) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.model = model;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
        this.onBoardComputer = onBoardComputer;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public boolean isGPS() {
        return GPS;
    }

    public boolean isOnBoardComputer() {
        return onBoardComputer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", model='" + model + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                ", onBoardComputer=" + onBoardComputer +
                '}';
    }
}
