package com.avacallery;

import java.util.List;

public class Console {

    // needs List of dice, not the entire MyHand class
    static public void showDice(List<Die> dice) {
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.println("\n");

        if (dice.equals(20)) {
            System.out.println("Critical hit!");
        }
        if (dice.equals(1)) {
            System.out.println("Critical miss!");
        }

    }

    static public void showDice(List<Die> dice, int armorClass) {
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
            System.out.println();
        }
        System.out.println("\n");
    }

}
