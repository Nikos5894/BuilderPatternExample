package com.company.cursor.Builder;

import com.company.cursor.Entities.Manual;
import com.company.cursor.Engines.Engine;

public class ManualBuilder implements Builder{

    private Manual manual;

    @Override
    public void reset(){manual = new Manual();}

    @Override
    public void setSeats(int seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setModel(String model) {
        manual.setModel(model);
    }

    @Override
    public void setOnBoardComputer(boolean set) {
            manual.setOnBoardComputer(set);
    }

    @Override
    public void setTripComputer(boolean set) {
        manual.setTripComputer(set);
    }

    @Override
    public void setGps(boolean set) {
        manual.setGPS(set);
    }

    public Manual getResult(){
        return this.manual;
    }
}
