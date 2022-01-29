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



        director.constructSportCar(carBuilder);
        director.constructSportCar(manualBuilder);

        Car sportCar = carBuilder.getResult();
        Manual sportCarManual = manualBuilder.getResult();

        System.out.println(sportCar);
        System.out.println(sportCarManual);
    }

    public static void makeClassicCar(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();



        director.constructClassicCar(carBuilder);
        director.constructClassicCar(manualBuilder);

        Car classicCar = carBuilder.getResult();
        Manual classicCarManual = manualBuilder.getResult();

        System.out.println(classicCar);
        System.out.println(classicCarManual);
    }
}
