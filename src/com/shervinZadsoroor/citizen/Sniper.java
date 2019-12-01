package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Sniper extends Citizen {

    public Sniper(String name) {
        super(name);
        setType("sniper");
    }

    public static int snipe() {
        return new Random().nextInt(Person.getPersons().size());
    }

    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Sniper{}";
    }
}
