package com.company.cursor.Builder;

import com.company.cursor.Entities.Car;
import com.company.cursor.Engines.Engine;

public class CarBuilder implements Builder {

    private Car car;


    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setModel(String model) {
        car.setModel(model);
    }

    @Override
    public void setOnBoardComputer(boolean set) {
            car.setOnBoardComputer(set);
    }

    @Override
    public void setTripComputer(boolean set) {
        car.setTripComputer(set);
    }

    @Override
    public void setGps(boolean set) {
        car.setGPS(set);
    }

    public Car getResult(){
        return this.car;
    }
}
