package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;
import com.shervinZadsoroor.citizen.Citizen;

import java.util.ArrayList;
import java.util.Random;

public abstract class Mafia extends Person {

    private static int counterOfMafias;

    public static int getCounterOfMafias() {
        return counterOfMafias;
    }

    public static void setCounterOfMafias(int counterOfMafias) {
        Mafia.counterOfMafias = counterOfMafias;
    }

    //in first night mafias must identify themselves , so there is a list
    private static ArrayList<Person> mafias = new ArrayList<>();


    public static ArrayList<Person> getMafias() {
        return mafias;
    }

    public Mafia(String name) {
        super(name);
        setCategory("mafia");
    }

    public static void kill() {
        ArrayList<Integer> indexOfCitizens = new ArrayList<>();
        for (int i = 0; i < Person.getPersons().size(); i++) {
            if (Person.getPersons().get(i).getCategory().equals("citizen")) {
                indexOfCitizens.add(i);
            }
        }
        System.out.println(indexOfCitizens);
        int killIndex = new Random().nextInt(indexOfCitizens.size());
        int kill = indexOfCitizens.get(killIndex);
        System.out.printf("last night %s has been killed\n",Person.getPersons().get(kill).getName());
        Person.getPersons().remove(kill);
        Citizen.setCounterOfCitizens(Citizen.getCounterOfCitizens()-1);
    }

}
