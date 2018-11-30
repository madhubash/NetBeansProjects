/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author ADITHYA
 */
public class result extends Exam implements Sports {
    private double finalmarks;

public void calculatemarks(){
           this.finalmarks=(getTestmark1()+ getTestmarks2())/2+ sportGracemarks;
}

    /**
     * @return the finalmarks
     */
    public double getFinalmarks() {
        return finalmarks;
    }
    
     public void printresult(){
         System.out.println("Marks : " + getFinalmarks());
     }
}