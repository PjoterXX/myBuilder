/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybuilder3Bad;

/**
 *
 * @author LeopardProMK
 */
public class Inhabitant {

    private Therapy therapy = null; //optional
    private Diagnosis diagnosis = null; //optional
    private AccommodationCard accommodationCard = null; //required

    private int id = 0; //required
    private int insuranceNumber = 0; //required
    private String name = null; //required
    private String placeOfResidence = null;//optional
    private String placeOfBirth = null;//optional
    private int age = 0; //required

    private Inhabitant(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.placeOfResidence = builder.placeOfResidence;
        this.age = builder.age;
    }

    public static class Builder {

        private Therapy therapy = null; //optional
        private Diagnosis diagnosis = null; //optional
        private AccommodationCard accommodationCard = null; //required

        private int id = 0; //required
        private int insuranceNumber = 0; //required
        private String name = null; //required
        private String placeOfResidence = null;//optional
        private String placeOfBirth = null;//optional
        private int age = 0; //required

        public Builder(String name, int id, int insuranceNumber, int age, AccommodationCard accommodationCard) {
            this.name = name;
            this.id = id;
            this.insuranceNumber = insuranceNumber;
            this.age = age;
            this.accommodationCard = accommodationCard;
        }

        public Builder setPlaceOfResidence(String placeOfResidence) {
            this.placeOfResidence = placeOfResidence;
            return this;
        }

        public Builder setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
            return this;
        }

        public Builder setTherapy(Therapy therapy) {
            this.therapy = therapy;
            return this;
        }

        public Builder setDiagnosis(Diagnosis diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public Inhabitant build() {
            return new Inhabitant(this);
        }
    }
}
