/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import java.util.Scanner;   
/**
 *
 * @author krish
 */
public class Lab1 {

    public static void main(String[] args) 
    {    
       Scanner sc =new Scanner(System.in);
       System.out.println("Please enter name of food item ,fatgrams and number of servings");
       String food_item =sc.next();
       int fat =sc.nextInt();
       int serv =sc.nextInt();
       int cal=fat*9;
       System.out.println("Total fat calories in "+ food_item + " per seving are " + cal/serv +"gram");
    }
}
