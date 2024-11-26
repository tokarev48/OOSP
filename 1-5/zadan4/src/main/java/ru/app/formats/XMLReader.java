package ru.app.formats;

public class XMLReader implements FileReader {
    @Override
    public void readFile() {
        System.out.println("Чтение данных из XML файла");
    }

    @Override
    public void writeFile() {
        System.out.println("Запись данных в XML файл");
    }
}
