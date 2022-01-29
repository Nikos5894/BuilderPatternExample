package com.company.cursor.Engines;

public class ClassicEngine extends Engine {
    private int power;

    public ClassicEngine() {
        this.power = 100;
    }

    @Override
    public String toString() {
        return "SportEngine{" +
                "power=" + power +
                '}';
    }
}
