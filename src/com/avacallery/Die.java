package com.avacallery;

import java.util.Random;

public class Die {
    private int value;
    private int sides;

    public Die(int sides) {
        this.sides = sides;
        this.value = 1;
    }

    public void roll(Random random) {

        value = random.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }

}
