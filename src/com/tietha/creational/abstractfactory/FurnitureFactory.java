package com.tietha.creational.abstractfactory;

public class FurnitureFactory {
    private FurnitureFactory() {
    }

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        return switch (materialType) {
            case WOOD -> new WoodFactory();
            case PLASTIC -> new PlasticFactory();
        };
    }
}
