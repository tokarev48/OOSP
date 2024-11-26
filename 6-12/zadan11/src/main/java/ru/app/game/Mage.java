package ru.app.game;

public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " атакует магией с силой " + getAttackPower());
    }
}
