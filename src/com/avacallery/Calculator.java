package com.avacallery;

public class Calculator {
    private int armorClass;
    private int defenseModifier;
    private int attackModifier;
    private String damageDice;

    public Calculator(int armorClass, int defenseModifier, int attackModifier, String damageDice) {
        this.armorClass = armorClass;
        this.defenseModifier = defenseModifier;
        this.attackModifier = attackModifier;
        this.damageDice = damageDice;

    }

    public static void attack(int value, int defenseModifier) {

        if (value == 20) {
            System.out.println("Critical hit!");
        }

        if (value == 1) {
            System.out.println("Critical miss!");
        }

        if (value < defenseModifier) {
            System.out.println("Miss");
        }

        if (value > defenseModifier) {
            System.out.println("Hit");
        }

    }





}
