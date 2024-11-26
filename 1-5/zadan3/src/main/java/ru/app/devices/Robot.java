package ru.app.devices;

import ru.app.connections.Connection;

public class Robot extends Device {
    public Robot(Connection connection) {
        super(connection);
    }

    @Override
    public void communicate() {
        System.out.println("Робот соединяется через " + connection.getType());
    }
}
