/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author krish
 */
    public class Car {
   
    private String make;
    private String model;
    private int year;
    private String colour;
    private int currentSpeed;
    private boolean isRunning;

    public Car(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.currentSpeed = 0; 
        this.isRunning = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Colour: " + colour);
    }

    public void start() {
        isRunning = true;
        System.out.println("Car started.");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Car stopped.");
    }

    public void accelerate(int speedChange) {
        if (isRunning) {
            currentSpeed += speedChange;
            System.out.println("Accelerated by " + speedChange + " units. Current speed: " + currentSpeed);
        } else {
            System.out.println("Start the car first!");
        }
    }

    public void brake(int speedChange) {
        if (isRunning) {
            currentSpeed -= speedChange;
            if (currentSpeed < 0) {
                currentSpeed = 0; // Ensure speed does not go below 0
            }
            System.out.println("Braked by " + speedChange + " units. Current speed: " + currentSpeed);
        } else {
            System.out.println("Start the car first!");
        }
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }
}
