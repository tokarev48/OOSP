package ru.app.connections;

public class WiFi implements Connection {
    @Override
    public String getType() {
        return "Wi-Fi";
    }
}
