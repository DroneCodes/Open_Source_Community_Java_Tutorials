package com.company;

public class Eye extends Organ {
    private String colour;  // the colour of the eye
    private boolean openeye;  // to know if the eye is open or not

    public Eye(String name, String medicalState, String colour, boolean openeye) {
        super(name, medicalState);
        this.colour = colour;
        this.openeye = openeye;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Colour " + getColour());
    }

    public void  Open () {
        this.setOpeneye(true);
        System.out.println(this.getName() +" Opened");
    }

    public void Close () {
        this.setOpeneye(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOpeneye() {
        return openeye;
    }

    public void setOpeneye(boolean openeye) {
        this.openeye = openeye;
    }
}
