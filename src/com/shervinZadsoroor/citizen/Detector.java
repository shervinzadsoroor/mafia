package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Detector extends Citizen {

    public Detector(String name) {
        super(name);
        super.type = "detector";
    }
    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Detector{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
