/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz3;
import java.util.Scanner;
/**
 *
 * @author krish
 */
public class Quiz3 {

//    public static void main(String[] args) {
//        int[] num = new int[10];
//        
//        for (int i = 0; i < num.length; i++) {
//            num[i] = i + 1; 
//        }
//        
//        boolean found = false;
//        
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == 4) {
//                found = true;
//                break;
//            }
//        }                                                                       
//        if (found) {
//            System.out.println("Number 4 is found in the array.");
//        } else {
//            System.out.println("Number 4 is not found in the array.");
//        }
//    }
//// Define the Car class
//public class Car {
//    private String make;  
//    private String model; 
//
//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
//
//    public void displayInfo() {
//        System.out.println("Car Make: " + make);
//        System.out.println("Car Model: " + model);
//    }
//
//    public static void main(String[] args) {
//        Car car1 = new Car(("BMW", "M5 CS");
//        Car car2 = new Car("Mercedese ", "AMG");
//
//        car1.displayInfo();
//        System.out.println();
//        car2.displayInfo();
//    }
//}
public static void main(String args[])
{
//    Scanner sc=new Scanner(System.in);
//    int num=sc.nextInt();
//    if(num % 2 == 0)
//    {
//        System.out.println(num + "is even");
//    }
//    else
//    {
//        System.out.println(num + "is odd");
//    }
//    public static void main(String[] args) {
//        int age = 21;
//
//        double price = 99.99;
//
//        String name = "Krishna";
//
//        // Print the values of the variables
//        System.out.println("Age: " + age);
//        System.out.println("Price: " + price);
//        System.out.println("Name: " + name);
//    }
//}
    public class Main {
    public static void main(String[] args) {
        String[] courses = {"Math", "English", "Music"};
        printCourses(courses); 
    }
 
    public static void printCourses(String[] courses) {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]); 
        }
    }
}

}
}
