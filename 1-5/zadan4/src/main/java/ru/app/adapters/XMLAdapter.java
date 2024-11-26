package ru.app.adapters;

import ru.app.formats.XMLReader;
import ru.app.formats.FileReader;

public class XMLAdapter implements FileAdapter {
    private FileReader fileReader;

    public XMLAdapter() {
        fileReader = new XMLReader();
    }

    @Override
    public void readFile() {
        fileReader.readFile();
    }

    @Override
    public void writeFile() {
        fileReader.writeFile();
    }
}
