package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;

import java.util.ArrayList;

public abstract class Mafia extends Person {
   // public static ArrayList<Person> mafias = new ArrayList<>();


    public Mafia(String name) {
        super(name);
        super.category = "mafia";
    }
}
