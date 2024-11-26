package ru.app.devices;

import ru.app.connections.Connection;

public abstract class Device {
    protected Connection connection;

    public Device(Connection connection) {
        this.connection = connection;
    }

    public abstract void communicate();
}
