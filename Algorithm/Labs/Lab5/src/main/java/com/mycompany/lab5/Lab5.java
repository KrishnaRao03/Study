/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

/**
 *
 * @author krish
 */
public class Lab5 {
 public static void main(String[] args) {
        Car myCar = new Car("BMW-M5 CS", "Mercedese AMG", 2024, "Black");


        myCar.displayCarInfo();

        myCar.setColour("Navy Blue");
        System.out.println("New Colour: " + myCar.getColour());

        System.out.println("Current Status: " + (myCar.isRunning() ? "Running" : "Not Running"));
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());

        myCar.start();
        System.out.println("Current Status: " + (myCar.isRunning() ? "Running" : "Not Running"));
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());

        myCar.accelerate(20);
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());

        myCar.brake(20);
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());

        myCar.stop();
        System.out.println("Current Status: " + (myCar.isRunning() ? "Running" : "Not Running"));
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());

        myCar.honk();
    }
}
