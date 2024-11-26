package ru.app.factories;

import ru.app.formats.PNGImage;
import ru.app.formats.Image;

public class PNGFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new PNGImage();
    }
}
