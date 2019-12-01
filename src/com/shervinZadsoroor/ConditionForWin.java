package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.mafia.Mafia;

public class ConditionForWin {
    public static boolean mafiaWins() {
        boolean isWinner = false;
        if (Mafia.getCounterOfMafias() == Citizen.getCounterOfCitizens()) {
            isWinner = true;
        }
        return isWinner;
    }

    public static boolean citizenWins() {
        boolean isWinner = false;
        if (Mafia.getCounterOfMafias() == 0) {
            isWinner = true;
        }
        return isWinner;
    }
}
