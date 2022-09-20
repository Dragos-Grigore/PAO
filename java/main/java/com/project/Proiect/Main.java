package com.project.Proiect;
import java.util.Scanner; 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

import javax.swing.JOptionPane;

 class Main {

   
    private static BufferedReader br1;
    private static BufferedReader br;

    public static void main(String[] args) {


String path="C:\\Users\\drago\\OneDrive\\Desktop\\PAO\\src\\main\\java\\com\\project\\Proiect\\Bike.csv";
String line="";
try{
br = new BufferedReader(new FileReader(path));
while((line=br.readLine())!=null)
{String[] bikes=line.split(",");
  System.out.println("Name: "+ bikes[0]+", Price: "+bikes[1]+", Year: "+bikes[2]+", NrWheels: "+bikes[3]+", Amount: "+bikes[4]+", Height: "+bikes[5]+", Wheel type: "+bikes[6]);
}
}catch (FileNotFoundException e){
  e.printStackTrace();
}catch (IOException e){
  e.printStackTrace();
}

String path1="C:\\Users\\drago\\OneDrive\\Desktop\\PAO\\src\\main\\java\\com\\project\\Proiect\\Car.csv";
String line1="";
try{
br1 = new BufferedReader(new FileReader(path1));
while((line1=br1.readLine())!=null)
{String[] cars=line1.split(",");
  System.out.println("Name: "+ cars[0]+", Price: "+cars[1]+", Year: "+cars[2]+", NrWheels: "+cars[3]+", Amount: "+cars[4]+", Engine type: "+cars[5]+", Speed: "+cars[6]+", Number of doors: "+cars[7]);

}
}catch (FileNotFoundException e){
  e.printStackTrace();
}catch (IOException e){
  e.printStackTrace();
}

String path2="C:\\Users\\drago\\OneDrive\\Desktop\\PAO\\src\\main\\java\\com\\project\\Proiect\\Motorcycle.csv";
String line2="";
try{
br = new BufferedReader(new FileReader(path2));
while((line2=br.readLine())!=null)
{String[] motorcycles=line2.split(",");
  System.out.println("Name: "+ motorcycles[0]+", Price: "+motorcycles[1]+", Year: "+motorcycles[2]+", NrWheels: "+motorcycles[3]+", Amount: "+motorcycles[4]+", Speed: "+motorcycles[5]);
}
}catch (FileNotFoundException e){
  e.printStackTrace();
}catch (IOException e){
  e.printStackTrace();
}

String path3="C:\\Users\\drago\\OneDrive\\Desktop\\PAO\\src\\main\\java\\com\\project\\Proiect\\VehicleForRent.csv";
String line3="";
try{
br = new BufferedReader(new FileReader(path3));
while((line3=br.readLine())!=null)
{String[] rent=line3.split(",");
  System.out.println("Name: "+ rent[0]+", Amount: "+rent[1]+", Price/day: "+rent[2]);
}
}catch (FileNotFoundException e){
  e.printStackTrace();
}catch (IOException e){
  e.printStackTrace();
}
        }


      }



    