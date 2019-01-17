package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) { // 7. revenim in APP ca sa o poate rula, doar de aici se ruleaza

        //revenim in APP ca sa apelam metoda start !!!!!
        //ca sa rulam doar asta, comentam restul prgamului selectam tot ctrl /
        //sunt atent sa nu comentez si ultima paranteza care inhide ca atunci da error
        //tot ce rulaza si arata programul, e doar aici in APP in args. de asta am rvenit aici ca sa rulez START method.
        //reguli: sirurile au lungime fixe, treb sa specific la crearea sirului

        Game game = new Game(); // 8. pt rulare. ACUM RULAM si imi va da valorile celor 2 trackuri., daca comenteze tot restul din APP imi va da doar cele 2 trackuri
        game.start();

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

        System.out.println(car);


     //   System.out.println(car.getName());

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
      /*  System.out.println(vehicle1.getColor());
vehicle1.setColor("rosu");
        System.out.println(vehicle1.getColor());
        System.out.println("Am printat color rosie");
        String test1 = vehicle1.getColor();
        System.out.println("Am setat test 1");*/

Vehicle.vehicleCount = 3;

System.out.println("Value from vehicle1: " + vehicle1.vehicleCount);
System.out.println("Value from vehicle2: " + vehicle2.vehicleCount);
System.out.println("Value from vehicle class: " + Vehicle.vehicleCount);


new AutoVehicle();
new AutoVehicle(new Engine());

// example of invoking overloaded methods //
        vehicle1.accelerate(34.12);
        vehicle2.accelerate(130,0.8);

        new UFO().accelerate(130,0.8);


        //polymorphism (an object can take multiple forms)
        Vehicle ufo = new UFO();
        //the type of the variable doesnt determine the object's behaviour
        ufo.accelerate(200,2);

        //the type of the var determines what methods can be invoked
        //we might need tpe casting (See below)

        ((UFO) ufo).concealCheating();

        System.out.println(vehicle1.toString());

    }

}



