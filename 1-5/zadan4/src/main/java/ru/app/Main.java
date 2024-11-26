package ru.app;

import ru.app.adapters.FileAdapter;
import ru.app.adapters.CSVAdapter;
import ru.app.adapters.JSONAdapter;
import ru.app.adapters.XMLAdapter;

public class Main {
    public static void main(String[] args) {
        FileAdapter csvAdapter = new CSVAdapter();
        csvAdapter.readFile();
        csvAdapter.writeFile();

        FileAdapter jsonAdapter = new JSONAdapter();
        jsonAdapter.readFile();
        jsonAdapter.writeFile();

        FileAdapter xmlAdapter = new XMLAdapter();
        xmlAdapter.readFile();
        xmlAdapter.writeFile();
    }
}
