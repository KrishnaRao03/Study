/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_4;

/**
 *
 * @author krish
 */
public class Lab_4 {
     public static void main(String[] args) {
        Car myCar = new Car("BMW-M5 CS", "Mercedese AMG", 2024, "Black");

        myCar.displayInfo();
        myCar.displaySpeed();

        myCar.start();
        myCar.displaySpeed();

        myCar.accelerate();
        myCar.displaySpeed();

        myCar.brake();
        myCar.displaySpeed();
        myCar.brake();
        myCar.displaySpeed();

        
        myCar.stop();
        myCar.displayInfo();
        myCar.displaySpeed();

        myCar.honk();
     }
}
