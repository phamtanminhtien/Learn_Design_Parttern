package com.tietha.creational.abstractfactory;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create Plastic Chair");
    }
}
