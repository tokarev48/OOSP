package ru.app;

import ru.app.devices.Device;
import ru.app.devices.Robot;
import ru.app.devices.Drone;
import ru.app.devices.Car;
import ru.app.connections.Connection;
import ru.app.connections.WiFi;
import ru.app.connections.Bluetooth;
import ru.app.connections.FourG;

public class Main {
    public static void main(String[] args) {
        Connection wifi = new WiFi();
        Connection bluetooth = new Bluetooth();
        Connection fourG = new FourG();

        Device robot = new Robot(wifi);
        robot.communicate();

        Device drone = new Drone(bluetooth);
        drone.communicate();

        Device car = new Car(fourG);
        car.communicate();
    }
}
