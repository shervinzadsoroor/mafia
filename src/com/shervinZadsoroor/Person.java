package com.shervinZadsoroor;

import java.util.ArrayList;

public abstract class Person {

    //    protected boolean isDay = true;
//    protected boolean isNight = true;
    protected String name;
    protected String category;  // can be mafia or citizen
    protected String type; // for example common or doctor or ...
    private static ArrayList<Person> persons = new ArrayList<>();
    private final static String[] discussions = {"discussion1", "discussion2", "discussion3", "discussion4",
            "discussion5", "discussion6", "discussion7", "discussion8", "discussion9", "discussion10", "discussion11",
            "discussion12", "discussion13", "discussion14", "discussion15", "discussion16", "discussion17", "discussion18",
            "discussion19", "discussion20",};


    public abstract String talk(); // discussion about who is mafia or not

    public static void startDiscussion() {
        for (Person p : getPersons()) {
            System.out.println(p.name + " : " + p.talk());
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public static ArrayList<Person> getPersons() {
        return persons;
    }

//    public static ArrayList<String> getDiscussions() {
//        return discussions;
//    }


    public static String[] getDiscussions() {
        return discussions;
    }
}
