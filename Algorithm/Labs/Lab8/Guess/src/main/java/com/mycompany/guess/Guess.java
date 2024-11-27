/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author krish
 */
public class Guess {

   
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;  
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");
        
        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break; 
            }
        }
    }

}
