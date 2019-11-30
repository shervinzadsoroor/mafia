package com.shervinZadsoroor;

import com.shervinZadsoroor.mafia.Mafia;

public class FirstNight {
    public static void execute() {
        // according to the rules , mafias must identify each other
        // so we must iterate on the list of persons and create a list of mafias
        for (Person p : Person.getPersons()) {
            if (p.getCategory().equals("mafia")) {
                Mafia.getMafias().add(p);
            }
        }
    }
}
