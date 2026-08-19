/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percentage;


/**
 *
 * @author 25032268
 */
public class Percentage {

  
  public static double computePercent(double num1, double num2){
        double total = (num1 / num2) * 100;
        return total;
       
       // System.out.println("");
    }
    
    public static void main(String[] args) {
     
        
        System.out.println("Enter the first value: "); 
       double num1 = 2.0;
        System.out.println("Enter the second value: ");
       double num2 = 5.0;
       
       double result = computePercent(num1, num2);
        System.out.println(num1 + "is " + result + " percent of " + num2);
        
       double result2 = computePercent(num2, num1);
        System.out.println(num2 + "is " + result2 + " percent of " + num1 );
    }
  
}
    

