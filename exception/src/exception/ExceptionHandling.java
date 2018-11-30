/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author ADITHYA
 */
public class ExceptionHandling {

      private static int divide(int numerator, int denominator)
              throws ArithmeticException {
        return numerator/denominator;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        
     try{  
        System.out.println("Please Enter an Integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Please Enter an Interger denominator: ");
        int demoninator = scanner.nextInt();
        
        
        int result=divide(numerator,demoninator);
        System.out.println(result);
    }
        catch(ArithmeticException ex){
            System.out.println("Use whole numbers");
          
        }
        catch (InputMismatchException ex){
           System.out.println("Error");
       }
        catch (Exception e)
      {
         System.out.println("blaaa");
      }
     }
}
    
  

