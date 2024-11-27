/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9;
import java.util.Scanner;
/**
 *
 * @author krish
 */

class ArrEg {

    public static int totalOfElements(int[] array, int size) {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += array[i];
        }
        return total;
    }

    public static int[] insertElement(int[] array, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array, int size) {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  
    }
}

public class Lab9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] myArr = new int[size];

        myArr = ArrEg.insertElement(myArr, size);

        ArrEg.printArray(myArr, size);

        int total = ArrEg.totalOfElements(myArr, size);
        System.out.println("Total of elements: " + total);
    }
}


