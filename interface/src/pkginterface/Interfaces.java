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
public class Interfaces {
    
    public static void main(String[] args){
        Exam exam =new result();
        exam.setStudentnumber(4);
        exam.setTestmark1(64);
        exam.setTestmarks2(64);
        exam.calculatemarks();
        exam.printresult();
        
    }}
