package com.tietha.creational.factory;

public class BankFactory {
    private BankFactory(){}
    public static Bank getBank(BankType bankType){
        return switch (bankType) {
            case MBBANK -> new MBBank();
            case TPBANK -> new TPBank();
        };
    }
}
