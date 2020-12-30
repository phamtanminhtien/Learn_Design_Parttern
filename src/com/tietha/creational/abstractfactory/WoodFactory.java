package com.tietha.creational.abstractfactory;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Door createDoor() {
        return new WoodDoor();
    }
}
