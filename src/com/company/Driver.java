package com.company;

public class Driver {
    @Override
    public String toString() {
        return "Driver{" +
                "Driver='" + Driver + '\'' + "is driven by" +
                '}';
    }

    private String Driver;
    private int age;

    public Driver(String Driver, int age) {
    this.Driver = Driver;
    this.age = age;
    }

    public static void setDriver(String Driver){

    }
    public String getDriver(){
        return this.Driver;
    }
}