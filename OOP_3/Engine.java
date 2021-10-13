package com.company;

public class Engine {
    private String Model;
    private int rpm;  // rpm means round per minute in conventional engine

    public Engine(String model, int rpm) {
        Model = model;
        this.rpm = rpm;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
