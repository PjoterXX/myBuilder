/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhabitantInfo;

/**
 *
 * @author LeopardProMK
 */
public class Diagnosis {

    private String description = null; //required
    private boolean isOsteoporosis = false;//optional

    public Diagnosis(String description) {
        this.description = description;
    }
}
