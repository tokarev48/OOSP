package ru.app.cars;

public class Car {
    private String brand;
    private String model;
    private String color;
    private String options;

    public Car(String brand, String model, String color, String options) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", цвет='" + color + '\'' +
                ", опции='" + options + '\'' +
                '}';
    }
}
