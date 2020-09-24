package com.avacallery;

// roll number between 1 and 20
// determine critical hit (20) or miss (1)
// enemy will have int armorClass + defenseModifier
// if D20 roll > armorClass, roll damageDice to calculate damage
// if between 2-19, add attack and defense mods to determine hit


import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.avacallery.Die;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Hand firstRoll = new Hand(1);

        firstRoll.rollDice(random);
        Console.showDice(firstRoll.getDice());

        Hand secondRoll = new Hand(2);
        secondRoll.rollDice(random);
        Console.showDice(secondRoll.getDice());

    }
}
