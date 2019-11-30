package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Natasha extends Mafia {

    public Natasha(String name) {
        super(name);
        setType("natasha");
    }

    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Natasha{}";
    }
}
