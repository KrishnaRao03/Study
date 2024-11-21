/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;
import java.util.Scanner;
/**
 *
 * @author krish
 */
public class Assignment1 {
    // Coded by Krishna
    public static double wall_area(Scanner sc)
    {
        System.out.println("Enter height,width of wall in feet and Number of walls");
        double wall_height=sc.nextDouble();
        double wall_width=sc.nextDouble();  
        int walls=sc.nextInt();
        return wall_height*wall_width*walls;     
    }
        public static double door_area(Scanner sc)
    {
        System.out.println("Enter height,width of door in feet and Number of door");
        double door_height=sc.nextDouble();  
        double door_width=sc.nextDouble();  
        int doors=sc.nextInt(); 
        return door_height*door_width*doors;     
    }
            public static double window_area(Scanner sc)
            {
        System.out.println("Enter height,width of door in feet and number of windows");
        double window_height=sc.nextDouble();  
        double window_width=sc.nextDouble();
        int windows=sc.nextInt();
        return window_height*window_width*windows;     
        
    }
           public static final int LabourWorkHours=8;
           public static final int LabourWorkCost=20;
           public static final int PerGalloons=300;

         
        public static void main(String[] args) 
        {

         Scanner sc=new Scanner(System.in);
        double wall_area=wall_area(sc);
        double door_area=door_area(sc);
        double window_area=window_area(sc);
       // coded by Vedant 
        double area_color=wall_area-door_area-window_area;
        
        System.out.println("Square feet of Walls = " + wall_area);
        System.out.println("Square feet of Doors = " + door_area);
        System.out.println("Square feet of Windows = " + window_area);
        System.out.println("Area to be painted = " + area_color);
        
        System.out.println("Price of paint per galloon?");
        int paint_cost=sc.nextInt();
        
        int paint_req=(int)(Math.round(area_color / PerGalloons));
        int lab_hrs= (paint_req * LabourWorkHours);
        double lab_cost=lab_hrs*LabourWorkCost;
        // Coded by Nisarg. with flowchart
        double cost=paint_req*paint_cost;
        System.out.println("Price of painting = " + cost);
        double totalpaintcost=lab_cost+cost;
            
        System.out.println("Number of galloons = " + paint_req);
        System.out.println("Hours of painting = " + lab_hrs);
        System.out.println("Cost of painting per galloon = " + paint_cost);
        System.out.println("Labour cost = " + lab_cost);
        System.out.println("Total cost of painting = " + totalpaintcost);
        }
}