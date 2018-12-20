package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Car car = new Car(); /**instantierea unui obiect, crearea unui obiect din clasa, car e variabila, imi creaaza variabila car, ca sa mai faco variabila, din nou car car2, imi va creaza a 2 a maasina*/
        car.name = "Dacia"; /** cu alt selectam ce vrem pe verticala*/
        car.color ="white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTraveledDistance = car.accelerate(100,2);

        /** metoda 1 pt a adauga si motor */

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate = LocalDateTime.now().plusYears(10);

        car.engine = engine; /** motorul care l-am creat il atribuim masinii noastre. Daca nu faecm asta, motorul exista, dar nu e folosit*/

        /** metoda 2 pt a adauga si motor */

        car.engine = new Engine(); /**e o relatie de compozitie, clasa car contine un obiect de tip as a, contine un obiect engine */

        engine = null; /** mai avem motorul, nu se sterge, dar nu il mai folosm */






    }


}



