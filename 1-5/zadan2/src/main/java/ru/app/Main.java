package ru.app;

import ru.app.formats.Image;
import ru.app.factories.ImageFactory;
import ru.app.factories.JPGFactory;
import ru.app.factories.PNGFactory;
import ru.app.factories.GIFFactory;

public class Main {
    public static void main(String[] args) {
        ImageFactory jpgFactory = new JPGFactory();
        Image jpgImage = jpgFactory.createImage();
        jpgImage.display();

        ImageFactory pngFactory = new PNGFactory();
        Image pngImage = pngFactory.createImage();
        pngImage.display();

        ImageFactory gifFactory = new GIFFactory();
        Image gifImage = gifFactory.createImage();
        gifImage.display();
    }
}
