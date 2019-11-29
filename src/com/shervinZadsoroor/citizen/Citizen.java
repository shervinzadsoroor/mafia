package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.ArrayList;

public abstract class Citizen extends Person {
    public static ArrayList<Person> citizens = new ArrayList<>();

    public Citizen(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}