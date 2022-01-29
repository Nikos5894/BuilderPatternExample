package com.company.cursor.Entities;

import com.company.cursor.Engines.Engine;

public  class Car {

    private  int seats;
    private Engine engine;
    private String model;
    private boolean tripComputer;
    private boolean GPS;
    private boolean onBoardComputer;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void setOnBoardComputer(boolean onBoardComputer) {
        this.onBoardComputer = onBoardComputer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", model='" + model + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                ", onBoardComputer=" + onBoardComputer +
                '}';
    }
}
