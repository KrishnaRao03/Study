/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab;
import java.util.Scanner;
public class Lab3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of students that have pet");   
        float have_pet=sc.nextInt();
        System.out.println("enter number of students that don't have pet");   
        float nothave_pet=sc.nextInt();
        float total=have_pet+nothave_pet;
        float pet_per= (have_pet*100)/total;
        float nopet_per= (nothave_pet*100)/total;
        System.out.println( pet_per +"Students Have Pets");   
        System.out.println( nopet_per +"Students Have Pets");
        
    }
}
