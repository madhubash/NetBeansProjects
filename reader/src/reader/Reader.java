/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


/**
 *
 * @author ADITHYA
 */
public class Reader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // Open the file that is the first 
            FileInputStream fstream = new FileInputStream("C:\\Users\\ADITHYA\\Desktop\\reader.txt");

            // Use DataInputStream to read binary NOT text.
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
            List<Integer> Numbers= new ArrayList<Integer>();

            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                // Add number from file to list 
                Numbers.add( Integer.parseInt(strLine)); 
            }
         
            System.out.println(Numbers );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
     public static double parseDecimal(String input) throws NullPointerException, ParseException{
          if(input == null){
            throw new NullPointerException();
          }

          input = input.trim();

          NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
          ParsePosition parsePosition = new ParsePosition(0);
          Number number = numberFormat.parse(input, parsePosition);

          if(parsePosition.getIndex() != input.length()){
            throw new ParseException("Invalid input", parsePosition.getIndex());
          }

          return number.doubleValue();
        }
}


