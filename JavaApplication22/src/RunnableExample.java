/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADITHYA
 */
public class RunnableExample implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("***");
        }
    }
    
}
