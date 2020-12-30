package com.tietha.creational.abstractfactory;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create Plastic Table");
    }
}
