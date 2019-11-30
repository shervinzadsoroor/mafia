package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Doctor extends Citizen {

    public Doctor(String name) {
        super(name);
        super.type = "doctor";
    }
    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
