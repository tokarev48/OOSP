package ru.app.formats;

public class JSONReader implements FileReader {
    @Override
    public void readFile() {
        System.out.println("Чтение данных из JSON файла");
    }

    @Override
    public void writeFile() {
        System.out.println("Запись данных в JSON файл");
    }
}