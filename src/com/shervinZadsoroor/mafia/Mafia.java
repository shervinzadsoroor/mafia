package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;
import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.citizen.Doctor;
import com.shervinZadsoroor.citizen.Sniper;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
        int killIndex = new Random().nextInt(indexOfCitizens.size());
        int kill = indexOfCitizens.get(killIndex);  //int kill is the index number of person in person list that must be killed

        //checking the existence of doctor......................................
        boolean isDoctorexists = false;
        int save = 0;
        for (Person p : getPersons()) {
            if (p.getType().equals("doctor")) {
                isDoctorexists = true;
                save = Doctor.saveCitizen();  // the index number of person who doctor wants to save
            }
        }
        if (isDoctorexists && save == kill) {
            System.out.println("last night a person saved by doctor!");
        } else {
            System.out.printf("last night %s has been killed\n", Person.getPersons().get(kill).getName());
            Person.getPersons().remove(kill);
            Citizen.setCounterOfCitizens(Citizen.getCounterOfCitizens() - 1);
        }

        //checking the existence of sniper.......................................
        boolean isSniperExists = false;
        int snipe = 0;
        for (Person p : getPersons()) {
            if (p.getType().equals("sniper")) {
                isSniperExists = true;
                snipe = Sniper.snipe();  // the index number of persons who is snipped
            }
        }
        if (isSniperExists && snipe != save) {
            System.out.printf("last night %s has been snipped!\n", Person.getPersons().get(snipe).getName());
            if (Person.getPersons().get(snipe).getCategory().equals("citizen")) {
                Citizen.setCounterOfCitizens(Citizen.getCounterOfCitizens() - 1);
            }
            if (Person.getPersons().get(snipe).getCategory().equals("mafia")) {
                Mafia.setCounterOfMafias(Mafia.getCounterOfMafias() - 1);
            }
            Person.getPersons().remove(snipe);
        }

    }

}
