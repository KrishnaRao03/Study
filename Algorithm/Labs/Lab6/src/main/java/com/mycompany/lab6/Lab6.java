/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

/**
 *
 * @author krish
 */
public class Lab6 {

    public static void main(String[] args) {
        DeskPhone myDeskPhone = new DeskPhone("Apple", "14-Pro-Max", "647-741-0182", "Personal");
        CellPhone myCellPhone = new CellPhone("Samsung", "Galaxy S24 Ultra", "647-9988", 50);

        myDeskPhone.call("647-9988");

        myCellPhone.sendText("647-9988", "Hola! How are you?");

        System.out.println("Current Battery Level: " + myCellPhone.getBatteryLevel() + "%");

        myCellPhone.chargeBattery(25); // Charge by 25%
    }
}


