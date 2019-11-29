package com.shervinZadsoroor.citizen;

public class CommonCitizen extends Citizen {

    public CommonCitizen(String name) {
        super(name);
        super.type = "common";
    }

    @Override
    public String toString() {
        return "CommonCitizen{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
