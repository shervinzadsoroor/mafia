package com.shervinZadsoroor.citizen;

import com.shervinZadsoroor.Person;

import java.util.Random;

public class Detective extends Citizen {

    public Detective(String name) {
        super(name);
        setType("detective");
    }

    @Override
    public String talk() {
        String str = Person.getDiscussions()[new Random().nextInt(20)];
        return str;
    }

    @Override
    public String toString() {
        return "Detective{}";
    }

    public static int detecting() {
        int vote;
        int boundRange = Person.getPersons().size();
        int detect = new Random().nextInt(boundRange);
        if (isMafia(detect)) {
            vote = detect;
        } else {
            vote = new Random().nextInt(boundRange);
        }
        return vote;
    }

    public static boolean isMafia(int detect) {
        boolean isMafia = false;
        if (Person.getPersons().get(detect).getCategory().equals("mafia")) {
            isMafia = true;
        }
        return isMafia;
    }
}
