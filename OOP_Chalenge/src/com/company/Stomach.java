package com.company;

public class Stomach extends  Organ {

    private boolean isEmpty; // to show if the stomach is empty

    public Stomach(String name, String medicalState, boolean isEmpty) {
        super(name, medicalState);
        this.isEmpty = isEmpty;
    }

    public void  Digest() {  // to show if the parents digest his food
        System.out.println("Food digestion ongoing");
    }

    @Override
    public void getInfo() {
        super.getInfo();  // we would create a loop to avaoid getting errors

        if (this.isEmpty()) {
            System.out.println("Feed the Patient");
        } else {
            System.out.println("Patient Eating capacity is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
