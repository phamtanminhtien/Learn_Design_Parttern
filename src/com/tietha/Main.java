package com.tietha;

import com.tietha.creational.abstractfactory.*;
import com.tietha.creational.builder.*;
import com.tietha.creational.factory.Bank;
import com.tietha.creational.factory.BankFactory;
import com.tietha.creational.factory.BankType;
import com.tietha.creational.singleton.ConfigSingleton;

public class Main {

    public static void main(String[] args) {
//        testFactory();
//        testSingleton();
//        testBuilder();
        testAbstractFactory();
    }

    public static void testFactory() {
        Bank TPBank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(TPBank.getBankName());
        Bank MBBank = BankFactory.getBank(BankType.MBBANK);
        System.out.println(MBBank.getBankName());
    }

    public static void testSingleton() {
        ConfigSingleton.getInstance().setName("Singleton Hello Everyone");
        System.out.println(ConfigSingleton.getInstance().getName());
    }

    public static void testBuilder() {
        Order order = new OrderBuilder()
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.FISH_SAUCE)
                .orderType(OrderType.TAKE_AWAY)
                .orderVegetable(VegetableType.SALAD)
                .build();
        System.out.println(order.toString());
    }

    public static void testAbstractFactory() {
        FurnitureAbstractFactory furnitureFactoryPlastic = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        FurnitureAbstractFactory furnitureFactoryWood = FurnitureFactory.getFactory(MaterialType.WOOD);
        //Plastic Chair
        Chair plasticChair = furnitureFactoryPlastic.createChair();
        plasticChair.create();
        //Plastic Table
        Table plasticTable = furnitureFactoryPlastic.createTable();
        plasticTable.create();

        //Wood Chair
        Chair woodChair = furnitureFactoryWood.createChair();
        woodChair.create();
        //Plastic Table
        Table woodTable = furnitureFactoryWood.createTable();
        woodTable.create();
    }
}






















