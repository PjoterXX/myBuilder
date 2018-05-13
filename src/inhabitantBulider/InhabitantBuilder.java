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
public interface InhabitantBuilder {
   public void buildAccommodationCard();

    public void buildTherapy();

    public void buildDiagnosis();

    public void buildInhabitant();
    
    public Inhabitant getInhabitant();  
}
