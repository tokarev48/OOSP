package ru.app.devices;

import ru.app.connections.Connection;

public class Drone extends Device {
    public Drone(Connection connection) {
        super(connection);
    }

    @Override
    public void communicate() {
        System.out.println("Дрон соединяется через " + connection.getType());
    }
}
