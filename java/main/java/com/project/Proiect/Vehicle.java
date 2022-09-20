package com.project.Proiect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

 public class Vehicle {
   protected String name;
   protected int price;
   protected int year;
   protected int nrWheels;
   protected int amount;
   
   public Vehicle(String name, int price, int year, int nrWheels,int amount) {
    this.name = name;
    this.price = price;
    this.year = year;
    this.nrWheels = nrWheels;
    this.amount=amount;
  }

  public int getAmount() {
    return amount;
}

public void setAmount(int amount) {
    this.amount = amount;
}



public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public int getNrWheels() {
    return nrWheels;
}

public void setNrWheels(int nrWheels) {
    this.nrWheels = nrWheels;
}
 
@Override
    public String toString() {
        return this.name + ", price " + this.price + " year "+ this.year+" wheel "+this.nrWheels+" amount "+this.amount;
    }



}
