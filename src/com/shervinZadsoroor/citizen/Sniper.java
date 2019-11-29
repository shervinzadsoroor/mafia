package com.shervinZadsoroor.citizen;

public class Sniper extends Citizen {

    public Sniper(String name) {
        super(name);
        super.type = "sniper";
    }


    @Override
    public String toString() {
        return "Sniper{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
