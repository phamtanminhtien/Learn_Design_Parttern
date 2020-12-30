package com.tietha.creational.builder;

public interface IOrderBuilder {
    IOrderBuilder orderType(OrderType orderType);
    IOrderBuilder orderBread(BreadType breadType);
    IOrderBuilder orderSauce(SauceType sauceType);
    IOrderBuilder orderVegetable(VegetableType vegetableType);
    Order build();
}
