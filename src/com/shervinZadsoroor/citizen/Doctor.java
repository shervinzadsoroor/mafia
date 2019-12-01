package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Doctor extends Citizen {

    public Doctor(String name) {
        super(name);
        setType("doctor");
    }

    public static int saveCitizen() {
        return new Random().nextInt(Person.getPersons().size());
    }


    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Doctor{}";
    }


}
