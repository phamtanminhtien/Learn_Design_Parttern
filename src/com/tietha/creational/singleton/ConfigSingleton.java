package com.tietha.creational.singleton;

public class ConfigSingleton {
    private ConfigSingleton(){}
    private String mName;
    private static final ConfigSingleton instance = new ConfigSingleton();

    public static ConfigSingleton getInstance(){
        return instance;
    }

    public void setName(String name){
        this.mName = name;
    }

    public String getName(){
        return  mName;
    }
}
