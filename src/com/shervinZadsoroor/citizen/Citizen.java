package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

public abstract class Citizen extends Person {

    private static int counterOfCitizens;

    public static int getCounterOfCitizens() {
        return counterOfCitizens;
    }

    public static void setCounterOfCitizens(int counterOfCitizens) {
        Citizen.counterOfCitizens = counterOfCitizens;
    }

    public Citizen(String name) {
        super(name);
        setCategory("citizen");
    }

}