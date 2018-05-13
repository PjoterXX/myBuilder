/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhabitantInfo;

import java.util.Date;

/**
 *
 * @author LeopardProMK
 */
public class AccommodationCard {

    private String typeOfAccommodation = null; //required
    private Date dateAccommodation = null; //required
    
    public AccommodationCard(String typeOfAccommodation) {
        this.typeOfAccommodation = typeOfAccommodation;
        this.dateAccommodation = new Date();
    }
}
