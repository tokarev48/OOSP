package ru.app;

import ru.app.editors.ImageEditor;

public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.setImageState("Изображение: Белый фон");
        editor.save();
        System.out.println(editor.getImageState());

        editor.setImageState("Изображение: Добавлена красная линия");
        editor.save();
        System.out.println(editor.getImageState());

        editor.restore();
        System.out.println(editor.getImageState());

        editor.restore();
        System.out.println(editor.getImageState());
    }
}
