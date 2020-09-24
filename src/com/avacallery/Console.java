package com.avacallery;

import java.util.List;

public class Console {

    // needs List of dice, not the entire MyHand class
    static public void showDice(List<Die> dice) {
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.println("\n");
    }

    static public void showDice(List<Die> dice, int armorClass) {
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
            System.out.println();
        }
        System.out.println("\n");
    }

}
