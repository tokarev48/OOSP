package ru.app.formats;

public class CSVReader implements FileReader {
    @Override
    public void readFile() {
        System.out.println("Чтение данных из CSV файла");
    }

    @Override
    public void writeFile() {
        System.out.println("Запись данных в CSV файл");
    }
}
