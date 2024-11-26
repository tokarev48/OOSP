package ru.app.animations;

public abstract class Animation {
    public void updateAnimation() {
        start();
        performAnimation();
        end();
    }

    protected abstract void performAnimation();

    private void start() {
        System.out.println("Запуск анимации...");
    }

    private void end() {
        System.out.println("Завершение анимации...");
    }
}
