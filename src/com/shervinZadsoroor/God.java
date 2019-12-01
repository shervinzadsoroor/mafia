package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.mafia.Mafia;

public class God {

    public static void main(String[] args) {
        int round = 0;

        ShufflingCards.execute();
        Person.startDiscussion();
        // mafia identify each other at first night
        FirstNight.execute();
        while (true) {
            round++;
            System.out.printf("\n\n++++++++++++++++++++++++  round %d  ++++++++++++++++++++++++\n", round);
            System.out.println("number of mafias : " + Mafia.getCounterOfMafias() + "\nnumber of citizens : " + Citizen.getCounterOfCitizens());
            Person.startDiscussion();
            Vote.execute();// omits the vote
            //checking the conditions for winning ====================================
            if (ConditionForWin.citizenWins()) {
                System.out.printf("citizens win in round %d!\n", round);
                break;
            }
            if (ConditionForWin.mafiaWins()) {
                System.out.printf("mafias win in round %d!\n", round);
                break;
            }
            Mafia.kill();// kills a citizen
            if (ConditionForWin.citizenWins()) {
                System.out.printf("citizens win in round %d!\n", round);
                break;
            }
            if (ConditionForWin.mafiaWins()) {
                System.out.printf("mafias win in round %d!\n", round);
                break;
            }
            //end of checking ========================================================
        }
    }

}
