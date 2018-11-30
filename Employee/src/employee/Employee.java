/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.Scanner;
/**
 *
 * @author ADITHYA
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int wage=10;
     CommissionEmployee x=new  CommissionEmployee();
     Scanner in = new Scanner(System.in);
     System.out.print("enter the commission Rate-");
    x.comRate = in.nextDouble();
    System.out.println("You entered string " + x.comRate);
//taking commission rate//
       
         
         HourlyEmployee y=new  HourlyEmployee();
         System.out.println("enter your working time-:");
         y.wtime = in.nextInt();
         System.out.println("You entered working time is " + y.wtime);
         //taking worked time//
       
         //HourlyEmployee z=new  HourlyEmployee();
         
         System.out.printf("your super salary is-:");
         double ve =y.worktime(wage, wage);
         System.out.println(""+ve);
         
    }
    
}
