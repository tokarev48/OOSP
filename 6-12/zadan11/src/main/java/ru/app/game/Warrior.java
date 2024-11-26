package ru.app.game;

public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " атакует мечом с силой " + getAttackPower());
    }
}
