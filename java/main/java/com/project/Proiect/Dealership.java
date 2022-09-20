package com.project.Proiect;

public class Dealership {

    private String Name;
    private int nrVehiclesRent;
    private int budget;
    private int nrVehicles;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getNrVehicles() {
        return nrVehicles;
    }

    public void setNrVehicles(int nrVehicles) {
        this.nrVehicles = nrVehicles;
    }


    public int getNrVehiclesRent() {
        return nrVehiclesRent;
    }

    public void setNrVehiclesRent(int nrVehiclesRent) {
        this.nrVehiclesRent = nrVehiclesRent;
    }

    public Dealership(String name, int budget, int nrVehicles, int nrVehiclesRent) {
        Name = name;
        this.budget = budget;
        this.nrVehicles = nrVehicles;
        this.nrVehiclesRent = nrVehiclesRent;
    }


}
