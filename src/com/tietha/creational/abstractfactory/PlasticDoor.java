package com.tietha.creational.abstractfactory;

public class PlasticDoor implements Door {
    @Override
    public void create() {
        System.out.println("Create Plastic Door");
    }
}
