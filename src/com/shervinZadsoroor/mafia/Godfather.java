package com.shervinZadsoroor.mafia;

public class Godfather extends Mafia {


    public Godfather(String name) {
        super(name);
        super.type = "godfather";
    }

    @Override
    public String toString() {
        return "Godfather{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
