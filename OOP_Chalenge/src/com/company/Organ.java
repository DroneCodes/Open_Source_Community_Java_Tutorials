package com.company;

public class Organ {
    // With this application i would be showing a patients name and each of his internal organs we can select and the details of the organs and also give the doctors to close or open the organs

    private String name;  // name of the patient
    private String medicalState; // the medical condition of the patient


    public Organ(String name, String medicalState) {
        this.name = name;
        this.medicalState = medicalState;
    }

    public void getInfo () {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalState());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalState() {
        return medicalState;
    }

    public void setMedicalState(String medicalState) {
        this.medicalState = medicalState;
    }
}
