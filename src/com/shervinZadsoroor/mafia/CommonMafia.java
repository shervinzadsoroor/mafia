package com.shervinZadsoroor.mafia;

public class CommonMafia extends Mafia {


    public CommonMafia(String name) {
        super(name);
        super.type = "common";
    }

    @Override
    public String toString() {
        return "CommonMafia{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
