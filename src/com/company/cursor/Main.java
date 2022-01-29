package com.company.cursor;

import com.company.cursor.Entities.Car;
import com.company.cursor.Entities.Director;
import com.company.cursor.Entities.Manual;
import com.company.cursor.Builder.CarBuilder;
import com.company.cursor.Builder.ManualBuilder;

public class Main {

    public static void main(String[] args) {
       makeClassicCar();
        System.out.println("--------------------------------------------------------------");
       makeSportCar();
    }

    public static void makeSportCar(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        Car sportCar = new Car();
        Manual sportCarManual = new Manual();

        director.constructSportCar(carBuilder);
        director.constructSportCar(manualBuilder);

        sportCar = carBuilder.getResult();
        sportCarManual = manualBuilder.getResult();

        System.out.println(sportCar);
        System.out.println(sportCarManual);
    }

    public static void makeClassicCar(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        Car classicCar = new Car();
        Manual classicCarManual = new Manual();

        director.constructClassicCar(carBuilder);
        director.constructClassicCar(manualBuilder);

        classicCar = carBuilder.getResult();
        classicCarManual = manualBuilder.getResult();

        System.out.println(classicCar);
        System.out.println(classicCarManual);
    }
}
