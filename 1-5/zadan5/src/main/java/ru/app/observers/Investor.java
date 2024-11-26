package ru.app.observers;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Инвестор " + name + " уведомлен: новая цена акций - " + price);
    }
}
