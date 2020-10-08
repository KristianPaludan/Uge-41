package com.company;

public class Car {
    @Override
    public String toString() {
        return ("Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", year=" + year + ", bodyStyle='" + bodyStyle + '\'' + '}');

    }

    private String make;
    private String model;
    private int year;
    private String bodyStyle;

    public void Car(String make, String model, int year, String bodyStyle) {
        this.year = year;
        this.model = model;
        this.make = make;
        this.bodyStyle = bodyStyle;







        //("Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle);
    }

}
