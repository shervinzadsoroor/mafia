package com.shervinZadsoroor;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private String category;  // can be mafia or citizen
    private String type; // for example common or doctor or ...
    private static ArrayList<Person> persons = new ArrayList<>();
    private final static String[] discussions = {"discussion1", "discussion2", "discussion3", "discussion4",
            "discussion5", "discussion6", "discussion7", "discussion8", "discussion9", "discussion10", "discussion11",
            "discussion12", "discussion13", "discussion14", "discussion15", "discussion16", "discussion17", "discussion18",
            "discussion19", "discussion20",};


    public abstract String talk(); // discussion about who is mafia or not

    //prints every person's discussion
    public static void startDiscussion() {
        for (Person p : getPersons()) {
            System.out.println(p.name + " : " + p.talk());
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<Person> getPersons() {
        return persons;
    }

    public static String[] getDiscussions() {
        return discussions;
    }
}
