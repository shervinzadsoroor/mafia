package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.*;
import com.shervinZadsoroor.mafia.CommonMafia;
import com.shervinZadsoroor.mafia.Godfather;
import com.shervinZadsoroor.mafia.Mafia;
import com.shervinZadsoroor.mafia.Natasha;

import java.util.Arrays;

public class God {

    public static void main(String[] args) {
        shufflingCards();
        for (Person c : Citizen.citizens) {
            System.out.println(c.toString());
        }
        System.out.println();
        for (Person m : Mafia.mafias) {
            System.out.println(m.toString());
        }

    }

    static void shufflingCards() {
        Detector detector = new Detector("detector");
        Doctor doctor = new Doctor("doctor");
        Snipper snipper = new Snipper("snipper");
        Citizen.citizens.add(detector);
        Citizen.citizens.add(doctor);
        Citizen.citizens.add(snipper);
        for (int i = 1; i <= 12; i++) {
            CommonCitizen commonCitizen = new CommonCitizen("citizen" + i);
            Citizen.citizens.add(commonCitizen);
        }
        Godfather godfather = new Godfather("godfather");
        Natasha natasha = new Natasha("natasha");
        Mafia.mafias.add(godfather);
        Mafia.mafias.add(natasha);
        for (int i = 1; i <= 3; i++) {
            CommonMafia commonMafia = new CommonMafia("mafia" + i);
            Mafia.mafias.add(commonMafia);
        }
    }
}
