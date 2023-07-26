package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.addAll(Arrays.asList(1,2,3,4));



        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer each : items ){
            System.out.println(each*2);
        }
    }

}
