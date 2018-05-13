/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybuilder;

/**
 *
 * @author LeopardProMK
 */
public class BadInhabitant {

    private String name = null; //required
    private boolean isAlive = false; //required
    private int id = 0; //required
    private boolean isOsteoporosis = false;//optional
    private String typeOfTherapy = null;//optional
    private String placeOfResidence = null;//optional
    private int age = 0; //required

    public BadInhabitant(String name, boolean isAlive, int id, boolean isOsteoporosis, String typeOfTherapy, String placeOfResidence, int age) {
        this.name = name;
        this.isAlive = isAlive;
        this.id = id;
        this.isOsteoporosis = isOsteoporosis;
        this.typeOfTherapy = typeOfTherapy;
        this.placeOfResidence = placeOfResidence;
        this.age = age;
    }

    public BadInhabitant(String name, boolean isAlive, int id, int age) {
        this(name, isAlive, id, false, "", "", age);
    }

    public BadInhabitant(String name, boolean isAlive, int id, int age, String typeOfTherapy) {
        this(name, isAlive, id, false, typeOfTherapy, "", age);
    }

    /**
     * @param isOsteoporosis the isOsteoporosis to set
     */
    public void setIsOsteoporosis(boolean isOsteoporosis) {
        this.isOsteoporosis = isOsteoporosis;
    }

    /**
     * @param typeOfTherapy the typeOfTherapy to set
     */
    public void setTypeOfTherapy(String typeOfTherapy) {
        this.typeOfTherapy = typeOfTherapy;
    }

    /**
     * @param placeOfResidence the placeOfResidence to set
     */
    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }
}
