/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment__1;
import java.util.Scanner ;
/**
 *
 * @author Peter
 */

public class Assignment__1 {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); 
        
         int factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is " + factorial);
    }
}

