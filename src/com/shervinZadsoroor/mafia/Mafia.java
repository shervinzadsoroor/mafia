package com.shervinZadsoroor.mafia;

import com.shervinZadsoroor.Person;

import java.util.ArrayList;

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


}
