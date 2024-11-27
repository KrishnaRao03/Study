/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fact;

import java.util.Scanner;

/**
 *
 * @author krish
 */
public class Fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Task 1
        int num;
        while (true) 
        {
            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            num = sc.nextInt();
            if (num < 0) 
                {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                } 
                else 
                {
                    break;  
                }
               
        }     
             long fact=1;

                for (int i = 1; i <= num; i++) 
                {
                    fact *= i;
                }
                            System.out.println("The factorial of " + num + " is: " + fact);

    }
}

