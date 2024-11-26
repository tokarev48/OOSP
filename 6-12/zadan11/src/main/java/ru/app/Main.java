package ru.app;

import ru.app.game.Character;
import ru.app.game.Warrior;
import ru.app.game.Mage;

public class Main {
    public static void main(String[] args) {
        Warrior originalWarrior = new Warrior("Рыцарь", 100, 15);
        Mage originalMage = new Mage("Маг", 80, 20);

        Character clonedWarrior = originalWarrior.clone();
        clonedWarrior.setName("Клон рыцаря");

        Character clonedMage = originalMage.clone();
        clonedMage.setHealth(90);

        System.out.println("Оригинал: " + originalWarrior.getName());
        originalWarrior.attack();

        System.out.println("Клон: " + clonedWarrior.getName());
        clonedWarrior.attack();

        System.out.println("Оригинал: " + originalMage.getName());
        originalMage.attack();

        System.out.println("Клон: " + clonedMage.getName() + " со здоровьем " + clonedMage.getHealth());
        clonedMage.attack();
    }
}
