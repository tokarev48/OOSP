package ru.app;

import ru.app.builders.CarBuilder;
import ru.app.cars.Car;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car car = builder.setBrand("Toyota")
                .setModel("Corolla")
                .setColor("Red")
                .setOptions("Sunroof")
                .build();

        System.out.println(car);
    }
}
