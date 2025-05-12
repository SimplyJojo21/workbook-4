package com.pluralsight;

import java.util.Random;

//create a class using the extends keyword to bascially copy all the functionality from
//the parent class to the child class
public class SuperHero extends SuperPerson{

    //constructor that calls the parent class constructor
    public SuperHero(String name, int health, int powerLevel) {
        super(name, health);

        //in the parent we default power level (XP) to 0
        //for our superhero we want to have them pass in power level
        //but just use that as xp
        this.experiencePoints = powerLevel;

        //let the world know the hero now exists
        System.out.println(this.name + " has arrived with a power level of " + powerLevel);
    }

    @Override
    public void fight(SuperPerson opponent) {
        //make the hero do a random amount of damage to the opponenet
        //the damage should be a random numnber plus the experiencesPoints(powerLevel)
        //if the base damage (without the xp) was 0, don't do any damage and just say you missed
        //otherwise deal the damage and say something about you kicking butt agains your opponent

        int baseDamage = new Random() .nextInt(16);
        int damage = baseDamage + this.experiencePoints;

        if (baseDamage == 0) {
            System.out.println(this.name + " swings heroically... but misses!");
        } else {
            System.out.println(this.name + " lands a heroic punch on " + opponent.name + " for " + damage);
            opponent.takeDamage(damage);
        }

    }


}