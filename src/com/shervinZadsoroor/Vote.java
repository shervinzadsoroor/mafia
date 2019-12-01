package com.shervinZadsoroor;

import com.shervinZadsoroor.citizen.Citizen;
import com.shervinZadsoroor.mafia.Mafia;

import java.util.*;

public class Vote {
    public static void execute() {

        ArrayList<Integer> votes = new ArrayList<>();
        int numOfPersons = Person.getPersons().size();
        for (int i = 0; i < Person.getPersons().size(); i++) {
            int vote = new Random().nextInt(numOfPersons);
            votes.add(vote);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : votes) {
            map.put(i, Collections.frequency(votes, i));
        }
        int maxValue = maxValue(map);

        System.out.println(map);
        System.out.println("max value is : " + maxValue);

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
            Person.getPersons().remove(key);
        }
        System.out.println("the key must be omit is : " + key);
        System.out.printf("number of mafias : %d\t number of citizens : %d",Mafia.getCounterOfMafias(),Citizen.getCounterOfCitizens());

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
