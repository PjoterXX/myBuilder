/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhabitantBulider;

import inhabitantInfo.Inhabitant;


/**
 *
 * @author LeopardProMK
 */
public class InhabitantDirector {

    private InhabitantBuilder inhabitantBuilder = null;

    public InhabitantDirector(InhabitantBuilder inhabitantBuilder) {
        this.inhabitantBuilder = inhabitantBuilder;
    }

    public void registerInhabitant() {
        inhabitantBuilder.buildAccommodationCard();
        inhabitantBuilder.buildDiagnosis();
        inhabitantBuilder.buildTherapy();
    }

    public Inhabitant getInhabitant() {
        return this.inhabitantBuilder.getInhabitant();
    }
}
