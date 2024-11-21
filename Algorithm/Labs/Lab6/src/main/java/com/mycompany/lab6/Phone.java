/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author krish
 */
public class Phone {
    private String brand;
    private String model;
    private String phoneNumber;

    public Phone(String brand, String model, String phoneNumber) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    public void call(String number) {
        System.out.println("Calling " + number + " from " + phoneNumber + "...");
    }

    public void receiveCall(String caller) {
        System.out.println("Receiving a call from " + caller + " on " + phoneNumber + "...");
    }
}

class DeskPhone extends Phone {
    private String location;

    public DeskPhone(String brand, String model, String phoneNumber, String location) {
        super(brand, model, phoneNumber);
        this.location = location;
    }

    @Override
    public void call(String number) {
        System.out.println("Desk phone at " + location + " is calling " + number + "...");
    }
}

class CellPhone extends Phone {
    private int batteryLevel;

    public CellPhone(String brand, String model, String phoneNumber, int batteryLevel) {
        super(brand, model, phoneNumber);
        this.batteryLevel = batteryLevel;
    }

    public void receiveText(String sender, String message) {
        System.out.println("Received text from " + sender + ": " + message);
    }

    public void sendText(String recipient, String message) {
        System.out.println("Sending text to " + recipient + ": " + message);
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        System.out.println("Battery charged. Current battery level: " + batteryLevel + "%");
    }
}


