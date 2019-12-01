package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.mafia.Mafia;

public class God {

    public static void main(String[] args) {
        int round = 0;

        ShufflingCards.execute();
        Person.startDiscussionInFirstDay();
        // mafia identify each other at first night
        FirstNight.execute();
        while (true) {
            round++;
            System.out.printf("\n\n#####################  R O U N D  %d  #####################\n", round);
            System.out.println("this is only for monitoring not a log: \nnumber of mafias : " + Mafia.getCounterOfMafias() + "\nnumber of citizens : " + Citizen.getCounterOfCitizens());
            Person.startDiscussion();
            System.out.println("_________________________________________________________");
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
