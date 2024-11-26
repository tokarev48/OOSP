package ru.app;

import ru.app.logger.EventLogger;

public class Main {
    public static void main(String[] args) {
        EventLogger logger = EventLogger.getInstance();

        logger.logEvent("Приложение запущено");
        logger.logEvent("Пользователь вошел в систему");
        logger.logEvent("Произошла ошибка подключения");

        System.out.println(logger.getLog());
    }
}
