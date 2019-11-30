package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class CommonCitizen extends Citizen {

    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    public CommonCitizen(String name) {
        super(name);
        super.type = "common";
    }


    @Override
    public String toString() {
        return "CommonCitizen{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
