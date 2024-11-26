package ru.app.factories;

import ru.app.formats.GIFImage;
import ru.app.formats.Image;

public class GIFFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new GIFImage();
    }
}
