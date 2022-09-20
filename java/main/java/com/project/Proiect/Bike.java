package com.project.Proiect;

 class Bike extends Vehicle{

    private int height;
    private String wheelType;

    public Bike(String name, int price, int year, int nrWheels, int amount) {
        super(name, price, year, nrWheels,amount);
    }
    
    public Bike(String name, int price, int year, int nrWheels,int amount, int height, String wheelType) {
        super(name, price, year, nrWheels,amount);
        this.height = height;
        this.wheelType = wheelType;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
   
    public String getWheelType() {
        return wheelType;
    }
    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }
    
}
