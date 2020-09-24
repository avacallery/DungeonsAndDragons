package com.avacallery;

import java.util.Random;

public class Die {
    private int value;
    private int sides;

    public Die(int sides) {
        this.sides = 20;
        this.value = 1;
    }

    public void roll(Random random) {

        value = random.nextInt(20) + 1;
    }

    public int getValue() {
        return value;
    }

}
