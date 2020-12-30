package com.tietha.creational.abstractfactory;

public class WoodDoor implements Door {
    @Override
    public void create() {
        System.out.println("Create Wood Door");
    }
}
