package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Godfather extends Mafia {

    public Godfather(String name) {
        super(name);
        setType("godfather");
    }


    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Godfather{}";
    }
}
