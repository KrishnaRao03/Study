/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_4;

/**
 *
 * @author krish
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int speed;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0;
    }

    public void accelerate() {
        System.out.println("Car Accelerated");
        speed += 20;
    }

    public void brake() {
        System.out.println("Car Braked");
        speed -= 10;
    }

    public void honk() {
        System.out.println("!!Honk!!");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
    public void displaySpeed(){
        System.out.println("Current Speed: " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}
