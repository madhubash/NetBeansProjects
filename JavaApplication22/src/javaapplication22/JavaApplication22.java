/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author ADITHYA
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //ThreadExample demo=new ThreadExample();
  //ThreadExample2 dem= new ThreadExample2();
 // demo.start();
 // dem.start();
 ThreadExample de=new  ThreadExample();
 de.start();
 Thread t1=new Thread(new RunnableExample());
 t1.start();
    }
   
}
