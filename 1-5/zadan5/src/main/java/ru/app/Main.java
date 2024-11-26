package ru.app;

import ru.app.observers.Investor;
import ru.app.observers.StockPrice;

public class Main {
    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();

        Investor investor1 = new Investor("Иван");
        Investor investor2 = new Investor("Мария");

        stockPrice.addObserver(investor1);
        stockPrice.addObserver(investor2);

        stockPrice.setPrice(100);  // Цена акций обновлена
        stockPrice.setPrice(120);  // Цена акций обновлена
    }
}
