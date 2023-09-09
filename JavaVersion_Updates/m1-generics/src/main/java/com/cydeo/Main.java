package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.addAll(Arrays.asList(1,2,3,4));



        printDoubled(items);

        System.out.println("----------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");
        liverpool.addPlayer(beckham);

        //Team<String> brokenTeam = new Team<>("what kind of team is this?");

        //Team<Integer> t2 = new Team<>("Very weird");

    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer each : items ){
            System.out.println(each*2);
        }
    }

}
