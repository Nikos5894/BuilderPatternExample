package com.company.cursor.Entities;

import com.company.cursor.Builder.Builder;
import com.company.cursor.CarType;
import com.company.cursor.Engines.ClassicEngine;
import com.company.cursor.Engines.SportEngine;

public class Director {

    public void constructSportCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setModel("Model 3");
        builder.setOnBoardComputer(true);
        builder.setTripComputer(false);
        builder.setGPS(true);
    }

    public void constructClassicCar(Builder builder){
        builder.setCarType(CarType.CLASSIC_CAR);
        builder.setSeats(4);
        builder.setEngine(new ClassicEngine());
        builder.setModel("Model 5");
        builder.setOnBoardComputer(false);
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
