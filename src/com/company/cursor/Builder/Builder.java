package com.company.cursor.Builder;

import com.company.cursor.CarType;
import com.company.cursor.Engines.Engine;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setModel(String model);

    void setOnBoardComputer(boolean onBoardComputer);

    void setTripComputer(boolean tripComputer);

    void setGPS(boolean gpsNavigator);

}
