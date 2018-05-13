/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybuilder;

import inhabitantBulider.InhabitantBuilder;
import inhabitantBulider.InhabitantDirector;
import inhabitantBulider.PermanentResidenceBuilder;
import inhabitantInfo.Inhabitant;

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
        inhabitantInfo.Therapy therapy1 = new inhabitantInfo.Therapy("Odpoczynek");
        inhabitantInfo.Diagnosis diagnosis1 = new inhabitantInfo.Diagnosis("Lekkie zmęczenie");
        inhabitantInfo.AccommodationCard accommodationCard1 = new inhabitantInfo.AccommodationCard("Pobyt stały");

        inhabitantInfo.Inhabitant inhabitant1 = new inhabitantInfo.Inhabitant.Builder("Michal", 1, 2342234, 76, accommodationCard1)
                .setDiagnosis(diagnosis1)
                .setTherapy(therapy1)
                .build();

        // Mieszkaniec zarejestrowany tymczasowo
        inhabitantInfo.Therapy therapy2 = new inhabitantInfo.Therapy("Odpoczynek");
        inhabitantInfo.Diagnosis diagnosis2 = new inhabitantInfo.Diagnosis("Lekkie zmęczenie");
        inhabitantInfo.AccommodationCard accommodationCard2 = new inhabitantInfo.AccommodationCard("Pobyt tymczasowy");

        inhabitantInfo.Inhabitant inhabitant2 = new inhabitantInfo.Inhabitant.Builder("Jacek", 1, 1442634, 88, accommodationCard2)
                .setDiagnosis(diagnosis2)
                .setTherapy(therapy2)
                .build();

        /* vs */

        /* Good */
        InhabitantBuilder inhabitantBuilder = new PermanentResidenceBuilder();
        InhabitantDirector director = new InhabitantDirector(inhabitantBuilder);

        director.registerInhabitant();
        Inhabitant inhabitant3 = director.getInhabitant();
    }

}
