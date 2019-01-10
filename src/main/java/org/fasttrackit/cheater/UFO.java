package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle{

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Accelerating as UFO");
        System.out.println(getName() + "acceletaed with" + speed + "km/h" + durationInHours + "hours.");

        double traveledDistance = 2 * speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance);

        return traveledDistance;

    }
    public void concealCheating() {

        System.out.println("Im not cheating!");
    }

    //example of co-variant return type
    //example of extending access privileges in overridden method
    @Override
    public UFO clone() {
        return new UFO();
    }
}
