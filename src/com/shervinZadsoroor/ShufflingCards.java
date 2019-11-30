package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.*;
import com.shervinZadsoroor.mafia.*;

public class ShufflingCards {
    public static void execute() {

        for (int i = 1; i <= 3; i++) {
            CommonMafia person = new CommonMafia("person" + i);
            Person.getPersons().add(person);
        }
        for (int i = 4; i <= 15; i++) {
            CommonCitizen person = new CommonCitizen("person" + i);
            Person.getPersons().add(person);
        }
        Godfather person16 = new Godfather("person16");
        Natasha person17 = new Natasha("person17");
        Detector person18 = new Detector("person18");
        Doctor person19 = new Doctor("person19");
        Sniper person20 = new Sniper("person20");
        Person.getPersons().add(person16);
        Person.getPersons().add(person17);
        Person.getPersons().add(person18);
        Person.getPersons().add(person19);
        Person.getPersons().add(person20);

        //counts the number of mafias and citizens
        int numberOfMafias = 0;
        int numberOfCitizen = 0;
        for (Person p : Person.getPersons()) {
            if (p.getCategory().equals("mafia")) {
                numberOfMafias++;
            }
            if (p.getCategory().equals("citizen")) {
                numberOfCitizen++;
            }
        }
        Mafia.setCounterOfMafias(numberOfMafias);
        Citizen.setCounterOfCitizens(numberOfCitizen);
    }


}
