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
public class Exam extends students{
    private double testmark1;
    private double testmarks2;
    private double marks ;

    /**
     * @return the testmark1
     */
    public double getTestmark1() {
        return testmark1;
    }

    /**
     * @param testmark1 the testmark1 to set
     */
    public void setTestmark1(double testmark1) {
        this.testmark1 = testmark1;
    }

    /**
     * @return the testmarks2
     */
    public double getTestmarks2() {
        return testmarks2;
    }

    /**
     * @param testmarks2 the testmarks2 to set
     */
    public void setTestmarks2(double testmarks2) {
        this.testmarks2 = testmarks2;
    }

    /**
     * @return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }
    
  public void calculatemarks(){
      this.marks=(getTestmark1()+ getTestmarks2())/2;
  }
  public  void printresult(){
      System.out.println("Exam Marks : "+getMarks());
  }
  }