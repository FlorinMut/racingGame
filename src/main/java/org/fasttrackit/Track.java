package org.fasttrackit;

public class Track { //1. incepem cursul 7 prin a crea un sir, pt asta imi trebuie prima data o clasa, unde com vrea conceptul la cum va arata sirul meu

    private String name; //incapsulare, punem private, nu punem simplu doar cu String name, il vom folosi doar aici si bineinteles in APP
    private double length;

    public Track(String name, double length) {   //3. construim un constucot tot cu alt insert, ca sa adaugam 2 valori in Game, in metida tracks
        this.name = name;
        this.length = length;
    }

    public String getName() {      //2. pt incapsulare trebuie geteri si setei, alt insert inainte de ultima paranteza, geters si seters, selectez mabele si OK
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
