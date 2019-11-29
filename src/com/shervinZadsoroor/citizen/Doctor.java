package com.shervinZadsoroor.citizen;

public class Doctor extends Citizen {

    public Doctor(String name) {
        super(name);
        super.type = "doctor";
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
