package ru.app;

import ru.app.animations.MoveAnimation;
import ru.app.animations.RotateAnimation;
import ru.app.animations.ScaleAnimation;

public class Main {
    public static void main(String[] args) {
        MoveAnimation move = new MoveAnimation();
        RotateAnimation rotate = new RotateAnimation();
        ScaleAnimation scale = new ScaleAnimation();

        move.updateAnimation();
        rotate.updateAnimation();
        scale.updateAnimation();
    }
}
