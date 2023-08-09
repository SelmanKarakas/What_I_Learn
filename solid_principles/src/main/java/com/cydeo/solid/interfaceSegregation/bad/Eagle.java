package com.cydeo.solid.interfaceSegregation.bad;

public class Eagle implements bird{

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
        System.out.println("Flying.");
    }

}
