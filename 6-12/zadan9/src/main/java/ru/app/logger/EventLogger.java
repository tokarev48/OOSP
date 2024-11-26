package ru.app.logger;

import java.time.LocalDateTime;

public class EventLogger {
    private static EventLogger instance;
    private final StringBuilder log = new StringBuilder();

    private EventLogger() {}

    public static EventLogger getInstance() {
        if (instance == null) {
            instance = new EventLogger();
        }
        return instance;
    }

    public void logEvent(String event) {
        log.append(LocalDateTime.now())
                .append(" - ")
                .append(event)
                .append("\n");
    }

    public String getLog() {
        return log.toString();
    }
}
