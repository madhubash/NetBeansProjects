/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author ADITHYA
 */

public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int num;
    System.out.println("Enter an  number:");

    
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
   
  
}
