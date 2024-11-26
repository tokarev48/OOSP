package ru.app.factories;

import ru.app.formats.JPGImage;
import ru.app.formats.Image;

public class JPGFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new JPGImage();
    }
}
