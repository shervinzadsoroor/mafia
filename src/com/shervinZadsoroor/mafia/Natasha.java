package com.shervinZadsoroor.mafia;

public class Natasha extends Mafia {

    public Natasha(String name) {
        super(name);
        super.type = "natasha";
    }

    @Override
    public String toString() {
        return "Natasha{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
