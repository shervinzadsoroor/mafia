package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

public abstract class Citizen extends Person {

    public Citizen(String name) {
        super(name);
        setCategory("citizen");
    }

}