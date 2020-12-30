package com.tietha.creational.abstractfactory;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create Wood Table");
    }
}
