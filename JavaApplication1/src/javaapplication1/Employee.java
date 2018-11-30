/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ADITHYA
 */
public class Employee {
  private String firstname;
  private String lastname;
   private Double monthlysalary;

   public Employee (String fname,String lname,double salary){
       firstname=fname;
       lastname=lname;
       monthlysalary=salary;
   }
   
  
   
    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the monthlysalary
     */
    public Double getMonthlysalary() {
        return monthlysalary;
    }

    /**
     * @param monthlysalary the monthlysalary to set
     */
    public void setMonthlysalary(Double monthlysalary) {
        if(monthlysalary >0)
        {
            
        this.monthlysalary = monthlysalary;
    }
        else{
            this.monthlysalary=0.0;
        }
                
    }
    
    public void increaseSalary(double rate)
    {
        this.monthlysalary = this.monthlysalary+this.monthlysalary*rate/100;
    }
    
    public double getyearlysalary()
    {
        return this.monthlysalary*12;
        
    }
    
}
    
    









