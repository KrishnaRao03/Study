/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author krish
 */
public class Lab7 {

   public static void main(String[] args) {
        // Instantiate the car
        Car myCar = new Car("BMW-M5 CS", "Mercedese AMG", 2024, "Black");

        // Display car information
        myCar.displayCarInfo();

        // Change the car color
        myCar.setColour("Blue");
        System.out.println("Car color changed to: " + myCar.getColour());

        // Display car state
        myCar.displayState();

        // Try to accelerate without starting
        myCar.accelerate(20);

        // Start the car
        myCar.start();

        // Switch gear to 'd'
        myCar.switchGear('d');

        // Accelerate the car
        myCar.accelerate(50);

        // Display car state
        myCar.displayState();

        // Brake the car
        myCar.brake(50);

        // Switch gear to 'r'
        myCar.switchGear('r');

        // Accelerate in reverse
        myCar.accelerate(20);

        // Display car state
        myCar.displayState();

        // Brake to stop
        myCar.brake(20);

        // Stop the car
        myCar.stop();

        // Switch gear to 'p'
        myCar.switchGear('p');

        // Display car state
        myCar.displayState();

        // Honk
        myCar.honk();
    }
}