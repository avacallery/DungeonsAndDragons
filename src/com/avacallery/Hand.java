package com.avacallery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.avacallery.Die;

public class Hand {
    private List<Die> dice = new ArrayList<Die>();

    public Hand(int size, int sides) {
        for (int numberOfSides = 0; numberOfSides < size; numberOfSides++)
            dice.add(new Die(sides));
    }

    public void rollDice(Random random) {
        for (var die : dice) {
            die.roll(random);

        }
    }

    public List<Die> getDice() {
        return dice;
    }

}
