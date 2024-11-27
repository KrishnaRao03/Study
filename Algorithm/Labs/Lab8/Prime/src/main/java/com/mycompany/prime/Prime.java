/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prime;

import java.util.Scanner;

/**
 *
 * @author krish
 */
public class Prime {
 
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter an integer (negative to continue, 0 to exit): ");
            number = scanner.nextInt();
            
            if (number < 0) {
                continue;  
            } else if (number == 0) {
                break;  
            } else {
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        }
        
        System.out.println("Program exited.");
    }
}

