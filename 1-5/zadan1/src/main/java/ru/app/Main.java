package ru.app;

import ru.app.drawing.Tool;
import ru.app.drawing.ToolFactory;

public class Main {
    public static void main(String[] args) {
        ToolFactory toolFactory = new ToolFactory();

        Tool pencil = toolFactory.getTool("Карандаш");
        pencil.use();

        Tool brush = toolFactory.getTool("Кисть");
        brush.use();

        Tool eraser = toolFactory.getTool("Ластик");
        eraser.use();
    }
}
