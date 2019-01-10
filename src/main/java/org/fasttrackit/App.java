package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate = LocalDateTime.now().plusYears(10);

        Car car = new Car(engine);/**instantierea unui obiect, crearea unui obiect din clasa, car e variabila, imi creaaza variabila car, ca sa mai faco variabila, din nou car car2, imi va creaza a 2 a maasina*/
        car.setName ("Dacia");
        car.setColor ("white");
        car.doorCount = 4;
        car.setMileage (7.5);
        car.running = true;

        System.out.println(car.getName());

        double carTraveledDistance = car.accelerate(100,2);

        /** metoda 1 pt a adauga si motor */



        car.engine = engine; /** motorul care l-am creat il atribuim masinii noastre. Daca nu faecm asta, motorul exista, dar nu e folosit*/

        /** metoda 2 pt a adauga si motor */

        car.engine = new Engine(); /**e o relatie de compozitie, clasa car contine un obiect de tip as a, contine un obiect engine */

        engine = null; /** mai avem motorul, nu se sterge, dar nu il mai folosm */

// Example of static variables unique for the whole application //
Vehicle vehicle1 = new Vehicle();
vehicle1.vehicleCount = 1;

Vehicle vehicle2 = new Vehicle();
vehicle2.vehicleCount = 2;


Vehicle.vehicleCount = 3;

System.out.println("Value from vehicle1: " + vehicle1.vehicleCount);
System.out.println("Value from vehicle2: " + vehicle2.vehicleCount);
System.out.println("Value from vehicle class: " + Vehicle.vehicleCount);


new AutoVehicle();
new AutoVehicle(new Engine());

// example of invoking overloaded methods //
        vehicle1.accelerate(34.12);
        vehicle2.accelerate(130,0.8);

    }

}



