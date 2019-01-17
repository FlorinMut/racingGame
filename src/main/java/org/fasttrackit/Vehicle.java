package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount; //ca sa fie din varoiabila constanta, punem final si cu snake case, adica toate literele mari la nume VEHICLE_COUNT //


    private String name; //tin alt si scriu pe toate liniile deodata, am facut toate propr private -> eroare la vehicle fiindca nu le mai vede acolo, e private/
    private String color;
    private double mileage;
    private double fuelLevel; //8. dupa pauza, la accelerare, sa pun si continutul cat combustibil mai avem
    private double totalTravelledDistance; // ORDINE ELEMENTE clasa: 1 propor statice, 2 propr instanta, constructori, getteri si seteri si suprascrierea metodei tostring la final

    public Vehicle() {
        vehicleCount++;
    }

    protected Vehicle clone () {

        Vehicle vehicle = new Vehicle();
        //copy properties from current object or simply call this.clone
        return vehicle;
    }


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

    public double getFuelLevel() {   // 9 get si set pt cele 2 variabile
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalTravelledDistance() {
        return totalTravelledDistance;
    }

    public void setTotalTravelledDistance(double totalTravelledDistance) {
        this.totalTravelledDistance = totalTravelledDistance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public double accelerate(double speed, double durationInHours) { //semnatura metodei cum se numeste si ce returneaza, parametrii sunt tip de data si denumire/

        System.out.println(name + "acceletaed with" + speed + "km/h" + durationInHours + "hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance);

        totalTravelledDistance = totalTravelledDistance + traveledDistance; // 10 calculam total travelled distance, adica dist totala va primi val lui de acum (acum e 0) + cat am parcurs pana cum traveled distance adica accelelrare ori timp

        totalTravelledDistance += traveledDistance; // sames as ce e sus
        System.out.println("Total travelled distance: " + totalTravelledDistance);


        double spentFuel = traveledDistance * mileage / 100;   //11. calc nivel de combustibil ramas, dar mai intai calc cat am consumat

        fuelLevel = fuelLevel - spentFuel;

        fuelLevel -= spentFuel; // acelasi lucru ca mai sus, e precum val crt fuel level - spent fuel, nu mai facem o noua variabila ci o stocam in aceeasi
        System.out.println("Remaining fuel: " + fuelLevel); //12. printam nivelul de combustibil


        return traveledDistance; // nu mai putem returna si total traveled dostance, pt ca ptem returna o sg valoare si deja e asta aici de cursul trecut

    }
    // example of method overloading //
    public double accelerate (double speed){
        return accelerate(speed,1);
    }

}
