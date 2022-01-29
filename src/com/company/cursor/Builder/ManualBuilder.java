package com.company.cursor.Builder;

import com.company.cursor.CarType;
import com.company.cursor.Entities.Car;
import com.company.cursor.Entities.Manual;
import com.company.cursor.Engines.Engine;

public class ManualBuilder implements Builder{


    private CarType type;
    private int seats;
    private Engine engine;
    private String model;
    private boolean tripComputer;
    private boolean onBoardComputer;
    private boolean gpsNavigator;



    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setOnBoardComputer(boolean onBoardComputer) {
        this.onBoardComputer = onBoardComputer;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult(){
        return new Manual(type, seats, engine, model, tripComputer, gpsNavigator, onBoardComputer);
    }


}
