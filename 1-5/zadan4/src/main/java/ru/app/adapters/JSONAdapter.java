package ru.app.adapters;

import ru.app.formats.JSONReader;
import ru.app.formats.FileReader;

public class JSONAdapter implements FileAdapter {
    private FileReader fileReader;

    public JSONAdapter() {
        fileReader = new JSONReader();
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
