package org.fasttrackit;

public class Vehicle {

    private String name; //tin alt si scriu pe toate liniile deodata, am facut toate propr private -> eroare la vehicle fiindca nu le mai vede acolo, e private/
    private String color;
    private double mileage;

    // public void - nu returneaza nimic

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //this.name = name.trim() - pt incapsulare, trim va sterge spatii de peste tot unde apare numele/
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    protected double accelerate(double speed, double durationInHours){ //semnatura metodei cum se numeste si ce returneaza, parametrii sunt tip de data si denumire/

        System.out.println(name + "acceletaed with" + speed + "km/h" + durationInHours + "hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance);

        return traveledDistance;




    }
}
