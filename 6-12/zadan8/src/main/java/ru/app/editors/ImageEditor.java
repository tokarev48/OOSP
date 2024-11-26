package ru.app.editors;

import ru.app.mementos.ImageMemento;

import java.util.Stack;

public class ImageEditor {
    private String imageState;
    private final Stack<ImageMemento> history = new Stack<>();

    public void setImageState(String imageState) {
        this.imageState = imageState;
    }

    public String getImageState() {
        return imageState;
    }

    public void save() {
        history.push(new ImageMemento(imageState));
    }

    public void restore() {
        if (!history.isEmpty()) {
            ImageMemento memento = history.pop();
            imageState = memento.getImageState();
        }
    }
}
