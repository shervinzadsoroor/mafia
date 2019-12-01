package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.mafia.Mafia;

public class God {

    public static void main(String[] args) {

        ShufflingCards.execute();
        Person.startDiscussion();
        // mafia identify each other at first night
        FirstNight.execute();
       // while (true) {
        System.out.println("number of mafias : "+Mafia.getCounterOfMafias()+"\nnumber of citizens : "+ Citizen.getCounterOfCitizens());
        Person.startDiscussion();
        Vote.execute();
        // }
    }

}
