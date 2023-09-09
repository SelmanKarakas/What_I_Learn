package com.cydeo.solid.interfaceSegregation.bad;

public class Chicken implements bird {

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

    @Override
    public void fly() {
        // Can not fly, so do nothing.
    }

}
