package com.company.cursor.Engines;

public class SportEngine extends Engine {
    private int power;

    public SportEngine() {
        this.power = 300;
    }

    @Override
    public String toString() {
        return "SportEngine{" +
                "power=" + power +
                '}';
    }
}
