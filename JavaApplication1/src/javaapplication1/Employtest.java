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
public class Employtest {
    public static void main( String[]args){
        Employee emp1=new Employee("sahan","noniz",10000.00);
        Employee emp2=new Employee("adithya","madhubash",120000.00);
        
       System.out.println("yearly salary of employe:"+emp1.getyearlysalary());
       System.out.println("yearly salary of employe:"+emp2.getyearlysalary());
        
                       
                       emp1.increaseSalary(10);
                       emp2.increaseSalary(8);
        
                       
       System.out.println("after the increment" );
                         
       System.out.println("yearly salary of employe:"+emp1.getyearlysalary());
       System.out.println("yearly salary of employe:"+emp2.getyearlysalary());
        
}
}