package ru.app.devices;

import ru.app.connections.Connection;

public class Car extends Device {
    public Car(Connection connection) {
        super(connection);
    }

    @Override
    public void communicate() {
        System.out.println("Автомобиль соединяется через " + connection.getType());
    }
}
