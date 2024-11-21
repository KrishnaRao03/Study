package com.mycompany.lab7;

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
    private char gear; 

    public static final int MAX_SPEED = 200; 

    public Car(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.currentSpeed = 0;
        this.isRunning = false;
        this.gear = 'p'; 
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
        if (!isRunning) {
            System.out.println("Please start the car.");
            return;
        }
        if (currentSpeed + speedChange <= MAX_SPEED) {
            currentSpeed += speedChange;
            System.out.println("Accelerated by " + speedChange + " units. Current speed: " + currentSpeed);
        } else {
            System.out.println("Cannot exceed the maximum speed of " + MAX_SPEED + " units.");
        }
    }

    public void brake(int speedChange) {
        if (currentSpeed - speedChange >= 0) {
            currentSpeed -= speedChange;
            System.out.println("Braked by " + speedChange + " units. Current speed: " + currentSpeed);
        } else {
            currentSpeed = 0;
            System.out.println("The car is already stopped.");
        }
    }

    public void switchGear(char newGear) {
        gear = newGear;
        System.out.println("Gear switched to: " + newGear);
    }

    public void displayState() {
        System.out.println("Car Status:");
        System.out.println("Status: " + (isRunning ? "Started" : "Stopped"));
        System.out.println("Speed: " + currentSpeed);
        switch (gear) {
            case 'p':
                System.out.println("The car is in Park.");
                break;
            case 'd':
                System.out.println("The car is in Drive.");
                break;
            case 'n':
                System.out.println("The car is in Neutral.");
                break;
            case 'r':
                System.out.println("The car is in Reverse.");
                break;
            default:
                System.out.println("Unknown gear.");
        }
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }
}
