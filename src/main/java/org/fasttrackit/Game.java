package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Track[] tracks = new Track[10]; // 3. declarare sir de obiecte; dupa crearea clasei Track si geteri, seteri, cream un sir de trackuri, va trebui sa ii zic lungimea de la incepit. Acum in memoria calc s-a creat un sir de 10 trackuri, la inceput sunt populate cu val null, val default pt obiecte

    // 17. stergem variabilele first competitor si secondcompetitor si facem o lista de competitori

    private List<Vehicle> competitors = new ArrayList<>(); // 18. ctrl click pe List deschide interfata list si mai avem ArrayList, acela e cu implement

    // cu rosu click in el alt enter si java.util, ca sa fie iportul de mai sus daca nu il scriem de mana,
    // vehicle intre diamond brackes

    public void start() {  // 6. apelam metoda

        addCompetitors(3); // 21. apelam listele noi create, practic adaugam competitori, fara sa ii punem noi 1, 2 ca la inceput.
        displayCompetitors();

        addTracks();//asta e apelarea. la declarare ii specificam toata forma si cream obiectele; la apelare doar o chem pe nume si specific lista de parametrii
        displayAvailableTracks();

    }

    private void addCompetitors(int competitorCount) { //19.

        //facem un constructor ca sa cream competitori si vehicule, adica facem un for

        for (int i = 0; i < competitorCount; i++) {

            Vehicle vehicle = new Vehicle();
            //vehicle properties will be populated when we learn to get user's input
            competitors.add(vehicle);


        }

    }

    // 20 incercam sa obtinem rand pe rand fiecare obiect din lista
    private void displayCompetitors() {
        System.out.println("Welcome! Today's competitors are: ");
        for (int i = 0; i < competitors.size(); i++) {

            System.out.println(competitors.get(i).getName());

        }


    }

    private void addTracks() {  //4. metoda, in care vom adauga obiecte in sir. doar paranteze fara ; daca da eroare "missing method body"

        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);

        tracks[0] = track1; // specificam pozitia din sir, tot timpul programatorii numara de la 0, nu de la 1. inn prima poz din sir avem acest track, highway acest moment i
        tracks[1] = track2; // pozitia din sir intre paranteze p[atrate, tot timpul cand e vb de siruri in Java. Acum avem 2 circuite.

        // acum avem 2 circuite in sir
        // pana acum am scris elementele din sir. sa vedem cum le citim datele din sir??

        //facem o nota metoda, display

    }

    private void displayAvailableTracks() { // 5. dupa metode nu punem ;

        System.out.println("Available tracks:");
        System.out.println(tracks[0].getName()); //()dupa getName
        System.out.println(tracks[1].getName());

        //acum am printat numele celor 2 trackuri

        //apelam cele 2 meotda ca sa testam ce am facut pana cum. pt asta sus private void start

        for (int i = 0; i < tracks.length; i++) {  //12. facem un clasic FOR loop, cat timp i < ca tracks length, adica 0 < 10, i devine 0 +1 =1, si tot asa.

            // deci executam de 11 ori, i = 0 , i =1 etc pana e 11, pt ca lung sieului nu scade e tot 10, doar sa vedem cum merge FORul
            // 13. compilam; la run imi da NULLPOINTER EXCEPTION, pt ca am populat doar 2 pozitii din sir, si nu toate 10, deci celelalate 8 au ramas NULL, nu e 0, e nimic.

            // 14. deci introduc o cond ca sa nu ne dea NULL si nici sa nu completam de la 3 la 10 ca pot fi 1000

            if (tracks[i] != null)  // daca e dif de null e facuta comanda SI DUPA IF NU PUNEM ; CA INSEAMNA CA AM TERMINAT IF-UL
            { //! = adica diferit

                // break; // cu acest break putem intrerupe forul daca am intalnit o conditie

                System.out.println(tracks[i].getName());

            }

        }


        //enhanced FOR sau "for-each" // e mai bun ca for clasic ca nu mai pot avea infinte loop, dar e mai limitta ca nu stiu la ce pozitie sunt.
        for (Track track : tracks) {  // 15. facem enhancedFOR
            if (track != null) {
                System.out.println(track.getName());

                //acum rulez, dar comentez for ul anterior, atentie sa comentez toate parantezele

                //break putem si la enhacnedFOR
                //BREAK iese afara din toata bucla, 16. CONTINUE iee afara doar din acea iteriatie
            }
        }


    }


}
