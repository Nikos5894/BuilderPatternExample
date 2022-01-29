package com.company.cursor.Builder;

import com.company.cursor.Engines.Engine;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(Engine  engine);
    void setModel(String model);
    void setOnBoardComputer(boolean set);
    void setTripComputer(boolean set);
    void setGps(boolean set);

}
