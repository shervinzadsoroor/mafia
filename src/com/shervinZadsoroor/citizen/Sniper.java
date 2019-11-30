package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Sniper extends Citizen {

    public Sniper(String name) {
        super(name);
        super.type = "sniper";
    }

    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
