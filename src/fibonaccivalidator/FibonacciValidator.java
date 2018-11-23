/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccivalidator;

import java.util.Scanner;

/**
 *
 * @author MVegas
 */
public class FibonacciValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Fibonacci Validator");
        System.out.println("\nPlease enter a number to validate:");
        
        Scanner sc = new Scanner(System.in);
        
        int numberToValidate = sc.nextInt();
             
        if(isFibonacci(numberToValidate))
            System.out.println(numberToValidate + " is a fibonacci number!");
        else
            System.out.println(numberToValidate + " is not a fibonacci number");
    }
    
    public static boolean isFibonacci(int n) {

        // fibonnaci can be found using the golden ratio
        
        // previous fibonnaci number
        long p = Math.round(n / 1.618);
        
        // previous 2 fibonnaci number
        long x = Math.round(p / 1.618);
        
        if(x + p == n){
            System.out.println("First fibonacci number to the left: " + p);
            System.out.println("Second fibonacci number to the left: " + x);
            System.out.println(p + " + " + x  + " = " + n);
            return true;
        }
        else
            return false;
    }
}
