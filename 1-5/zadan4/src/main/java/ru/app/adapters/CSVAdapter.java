package ru.app.adapters;

import ru.app.formats.CSVReader;
import ru.app.formats.FileReader;

public class CSVAdapter implements FileAdapter {
    private FileReader fileReader;

    public CSVAdapter() {
        fileReader = new CSVReader();
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
