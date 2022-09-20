package com.project.Proiect;

 class Motorcycle extends Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Motorcycle(String name, int price, int year, int nrWheels, int amount) {
        super(name, price, year, nrWheels,amount);}

    public Motorcycle(String name, int price, int year, int nrWheels,int amount, int speed) {
        super(name, price, year, nrWheels, amount);
        this.speed = speed;
    }
    
}
