package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    double mileage;

    // public void - nu returneaza nimic

    public double accelerate(double speed, double durationInHours){ //semnatura metodei cum se numeste si ce returneaza, parametrii sunt tip de data si denumire/

        System.out.println(name + "acceletaed with" + speed + "km/h" + durationInHours + "hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance);

        return traveledDistance;


    }
}
