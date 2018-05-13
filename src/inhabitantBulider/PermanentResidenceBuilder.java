/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhabitantBulider;

import inhabitantInfo.AccommodationCard;
import inhabitantInfo.Diagnosis;
import inhabitantInfo.Inhabitant;
import inhabitantInfo.Therapy;

/**
 *
 * @author LeopardProMK
 */
public class PermanentResidenceBuilder implements InhabitantBuilder  {

    Inhabitant inhabitant = null;

    Therapy therapy = null;
    Diagnosis diagnosis = null;
    AccommodationCard accommodationCard = null;

    @Override
    public void buildAccommodationCard() {
        String typeOfAccommodation = "";
          this. accommodationCard = new AccommodationCard(typeOfAccommodation);
    }

    @Override
    public void buildTherapy() {
        String typeOfTherapy = "";
      this. therapy = new Therapy(typeOfTherapy);
    }

    @Override
    public void buildDiagnosis() {
        String description = "";
      this.diagnosis = new Diagnosis(description);
    }

    @Override
    public void buildInhabitant() {
        String name = "";
        this.inhabitant = new Inhabitant.Builder(name, 0, 0, 0, accommodationCard)
                .setDiagnosis(diagnosis)
                .setTherapy(therapy)
                .build();
    }

    @Override
    public Inhabitant getInhabitant() {
        return inhabitant;
    }

   
}
