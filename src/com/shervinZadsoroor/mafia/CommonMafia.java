package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class CommonMafia extends Mafia {

    public CommonMafia(String name) {
        super(name);
        setType("common");
    }

    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "CommonMafia{}";
    }
}
