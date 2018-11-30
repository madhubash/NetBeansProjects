/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author ADITHYA
 */
public class HourlyEmployee extends Employee {
    
    public int wtime;
   
 public double worktime(int worktime, int wage){
     double ans = 0;
     
     if(worktime <=40)
  {
       ans=wage*worktime;
  }
  else if (worktime>40)
  {
       ans= 40*wage+(worktime-40)*wage*1.5;
  }
       return ans; 
 }
 
    
    
    
}
     
