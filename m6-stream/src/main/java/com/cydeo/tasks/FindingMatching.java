package com.cydeo.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        //All Match
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        //Any Match
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        //None Match
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        //Find Any
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //Find First
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish2.get());

        //Parallel Streams (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //Min and Max
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));

        System.out.println(dMin.get());
        System.out.println(dMax.get());
    }

}
