/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybuilder;

/**
 *
 * @author DominatorMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Bad */
        // Mieszaniec zarejestrowany na pobyt staly
        mybuilder3Bad.Therapy therapy1 = new mybuilder3Bad.Therapy("Odpoczynek");
        mybuilder3Bad.Diagnosis diagnosis1 = new mybuilder3Bad.Diagnosis("Lekkie zmęczenie");
        mybuilder3Bad.AccommodationCard accommodationCard1 = new mybuilder3Bad.AccommodationCard("Pobyt stały");

        mybuilder3Bad.Inhabitant inhabitant1 = new mybuilder3Bad.Inhabitant.Builder("Michal", 1, 2342234, 76, accommodationCard1)
                .setDiagnosis(diagnosis1)
                .setTherapy(therapy1)
                .build();

        // Mieszkaniec zarejestrowany tymczasowo
        mybuilder3Bad.Therapy therapy2 = new mybuilder3Bad.Therapy("Odpoczynek");
        mybuilder3Bad.Diagnosis diagnosis2 = new mybuilder3Bad.Diagnosis("Lekkie zmęczenie");
        mybuilder3Bad.AccommodationCard accommodationCard2 = new mybuilder3Bad.AccommodationCard("Pobyt tymczasowy");

        mybuilder3Bad.Inhabitant inhabitant2 = new mybuilder3Bad.Inhabitant.Builder("Jacek", 1, 1442634, 88, accommodationCard2)
                .setDiagnosis(diagnosis2)
                .setTherapy(therapy2)
                .build();

        /* vs */

        /* Good */
        //...
    }

}
