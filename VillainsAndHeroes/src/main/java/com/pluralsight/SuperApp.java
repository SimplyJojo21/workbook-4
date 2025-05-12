package com.pluralsight;

public class SuperApp {

    public static void main(String[] args) {

        //create 2 SuperPeople
        SuperPerson superFood = new SuperPerson("Pizza", 100);
        SuperHero superJo = new SuperHero("Joanna", 100, 45);
        SuperVillain AgentSmith = new SuperVillain("AgentSmith", 100, 40);
        SuperVillain Taxes = new SuperVillain("Taxes", 100, 50);

        //ask eachSuperPerson how they are doing
        System.out.println((superFood.getStatus()));
        System.out.println((superJo.getStatus()));


        //take damage
        superFood.takeDamage(15);
        superJo.takeDamage(20);

        //ask eachSuperPerson how they are doing
        System.out.println(superFood.getStatus());
        System.out.println(superJo.getStatus());

        //make the superfolks fight each other
        superFood.fight(superJo);
        superJo.fight(superFood);

        //ask eachSuperPerson how they are doing
        System.out.println(superFood.getStatus());
        System.out.println(superJo.getStatus());

    }

}