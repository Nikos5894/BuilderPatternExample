package com.company.cursor.Entities;

import com.company.cursor.Engines.Engine;

public class Manual {
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
        return "Manual\n{" +
                "seats=" + seats +
                ",\nengine=" + engine +
                ",\nmodel='" + model + '\'' +
                ",\ntripComputer=" + tripComputer +
                ",\nGPS=" + GPS +
                ",\nonBoardComputer=" + onBoardComputer +
                '}';
    }
}
