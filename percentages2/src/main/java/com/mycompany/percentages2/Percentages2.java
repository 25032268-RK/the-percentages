/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percentages2;

/**
 *
 * @author 25032268
 */
import java.util.Scanner;
public class Percentages2 {
    
  public static double computePercent(double num1, double num2){
        double percentage = (num1 / num2) * 100;
        return percentage;
       
       // System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first value: "); 
       double num1 = scanner.nextDouble();
        System.out.println("Enter the second value: ");
       double num2 = scanner.nextDouble();
       
       double result = computePercent(num1, num2);
        System.out.println(num1 + " is " + result + " percent of " + num2);
        
       double result2 = computePercent(num2, num1);
        System.out.println(num2 + " is " + result2 + " percent of " + num1 );
        scanner.close();
    }
  
}
