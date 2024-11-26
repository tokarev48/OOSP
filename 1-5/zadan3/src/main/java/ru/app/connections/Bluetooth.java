package ru.app.connections;

public class Bluetooth implements Connection {
    @Override
    public String getType() {
        return "Bluetooth";
    }
}
