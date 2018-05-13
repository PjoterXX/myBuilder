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
public class Inhabitant {

    private String name = null; //required
    private boolean isAlive = false; //required
    private int id = 0; //required
    private boolean isOsteoporosis = false;//optional
    private String typeOfTherapy = null;//optional
    private String placeOfResidence = null;//optional
    private int age = 0; //required

    private Inhabitant(Builder builder) {
        this.name = builder.name;
        this.isAlive = builder.isAlive;
        this.id = builder.id;
        this.isOsteoporosis = builder.isOsteoporosis;
        this.typeOfTherapy = builder.typeOfTherapy;
        this.placeOfResidence = builder.placeOfResidence;
        this.age = builder.age;
    }

    public static class Builder {

        private String name = null; //required
        private boolean isAlive = false; //required
        private int id = 0; //required
        private boolean isOsteoporosis = false;//optional
        private String typeOfTherapy = null;//optional
        private String placeOfResidence = null;//optional
        private int age = 0; //required

        public Builder(String name, boolean isAlive, int id, int age) {
            this.name = name;
            this.isAlive = isAlive;
            this.id = id;
            this.age = age;
        }

        public Builder setIsOsteoporosis(boolean isOsteoporosis) {
            this.isOsteoporosis = isOsteoporosis;
            return this;
        }

        public Builder setTypeOfTherapy(String typeOfTherapy) {
            this.typeOfTherapy = typeOfTherapy;
            return this;
        }

        public Builder setPlaceOfResidence(String placeOfResidence) {
            this.placeOfResidence = placeOfResidence;
            return this;
        }

        public Inhabitant build() {
            return new Inhabitant(this);
        }
    }
}
