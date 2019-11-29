package com.shervinZadsoroor;

public class God {

    public static void main(String[] args) {
        ShufflingCards.execute();

        for (Person p : Person.getPersons()) {
            System.out.println(p.toString());
        }

    }

}
