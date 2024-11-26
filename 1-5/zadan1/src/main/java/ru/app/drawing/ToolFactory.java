package ru.app.drawing;

public class ToolFactory {
    public Tool getTool(String toolType) {
        if (toolType == null) {
            return null;
        }
        if (toolType.equalsIgnoreCase("Карандаш")) {
            return new Pencil();
        } else if (toolType.equalsIgnoreCase("Кисть")) {
            return new Brush();
        } else if (toolType.equalsIgnoreCase("Ластик")) {
            return new Eraser();
        }
        return null;
    }
}
