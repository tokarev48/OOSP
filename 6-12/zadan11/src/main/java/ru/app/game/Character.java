package ru.app.game;

public abstract class Character implements Cloneable {
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public Character clone() {
        try {
            return (Character) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Ошибка клонирования");
        }
    }

    public abstract void attack();
}
