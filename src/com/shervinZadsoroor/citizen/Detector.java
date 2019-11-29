package com.shervinZadsoroor.citizen;

public class Detector extends Citizen {

    public Detector(String name) {
        super(name);
        super.type = "detector";
    }

    @Override
    public String toString() {
        return "Detector{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
