package com.shervinZadsoroor;

import java.util.ArrayList;

public abstract class Person {

    protected  boolean isDay = true;
    protected  boolean isNight = true;
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}
