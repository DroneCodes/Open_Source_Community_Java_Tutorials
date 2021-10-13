package com.company;

public class Heart extends Organ {

    private  int rate;  // Heart Rate

    public Heart(String name, String medicalState, int rate) {
        super(name, medicalState);
        this.rate = rate;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Heart Rate: " + this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
