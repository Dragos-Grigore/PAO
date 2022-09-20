package com.project.Proiect;

class Car extends Vehicle {
    private String engineType;
    private int speed;
    private int nrDoors;

    public Car(String name, int price, int year, int nrWheels,int amount) {
        super(name, price, year, nrWheels,amount);}
    public Car(String name, int price, int year, int nrWheels,int amount, String engineType, int speed, int nrDoors) {
        super(name, price, year, nrWheels,amount);
        this.engineType = engineType;
        this.speed = speed;
        this.nrDoors = nrDoors;
    }
        public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getNrDoors() {
        return nrDoors;
    }
    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }
}
