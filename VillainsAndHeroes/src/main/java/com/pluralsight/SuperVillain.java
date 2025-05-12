package com.pluralsight;

import java.util.Random;

public class SuperVillain extends SuperPerson{

    //constructor that calls the parent class constructor
    public SuperVillain(String name, int health, int evilLevel) {
        super(name, health);

        this.experiencePoints = evilLevel;

        System.out.println(this.name + " has arrived with an evil level of " + evilLevel);
    }

    @Override
    public void fight(SuperPerson opponent) {

        int baseDamage = new Random().nextInt(50);
        int damage = baseDamage + this.experiencePoints;

        if (baseDamage == 0) {
            System.out.println(this.name + " swings maniacally... but misses!");
        } else {
            System.out.println(this.name + " lands an evil laser glare on " + opponent.name + " for " + damage);
            opponent.takeDamage(damage);
        }

    }

}