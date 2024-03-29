package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.citizen.Detective;
import com.shervinZadsoroor.mafia.Mafia;

import java.util.*;

public class Vote {
    public static void execute() {

        ArrayList<Integer> votes = new ArrayList<>();
        int numOfPersons = Person.getPersons().size();
        for (int i = 0; i < Person.getPersons().size(); i++) {
            int vote;
            //if the voter is detective -------------------------------
            if (Person.getPersons().get(i).getType().equals("detective")) {
                vote = Detective.detecting();
            } else {
                vote = new Random().nextInt(numOfPersons);
            }
            votes.add(vote);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : votes) {
            map.put(i, Collections.frequency(votes, i));
        }
        int maxValue = maxValue(map);

        System.out.println("vote result : " + map);
       // System.out.println("max value is : " + maxValue);

        boolean isNotDuplicated = true;
        int counter = 0;
        for (Integer m : map.values()) {
            if (maxValue == m) {
                counter++;
            }
        }
        if (counter > 1) {
            isNotDuplicated = false;
        }
        int key = 0;
        if (isNotDuplicated) {
            key = getKey(map, maxValue);
            if (Person.getPersons().get(key).getCategory().equals("mafia")) {
                Mafia.setCounterOfMafias(Mafia.getCounterOfMafias() - 1);
            }
            if (Person.getPersons().get(key).getCategory().equals("citizen")) {
                Citizen.setCounterOfCitizens(Citizen.getCounterOfCitizens() - 1);
            }
            System.out.printf("\n%s omitted!!!\n", Person.getPersons().get(key).getName());
            Person.getPersons().remove(key);
        } else {
            System.out.println("no body omitted!!!");
        }
        //System.out.println("the key must be omit is : " + key);
        System.out.printf("this is only for monitoring not a log: \nnumber of mafias : %d\t number of citizens : %d\n__________________________ LOG __________________________\n"
                , Mafia.getCounterOfMafias(), Citizen.getCounterOfCitizens());

    }

    public static <K, V extends Comparable<V>> V maxValue(Map<K, V> map) {
        Map.Entry<K, V> maxEntry = Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue));
        return maxEntry.getValue();
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
