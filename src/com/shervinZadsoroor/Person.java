package com.shervinZadsoroor;

import java.util.ArrayList;

public abstract class Person {

//    protected boolean isDay = true;
//    protected boolean isNight = true;
    protected String name;
    protected String category;  // can be mafia or citizen
    protected String type; // for example common or doctor or ...
    private static ArrayList<Person>persons = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public static ArrayList<Person> getPersons() {
        return persons;
    }
}
