/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patchingexceptions;
import java.util.Scanner; 
import javax.swing.*;
public class PatchingExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myInput;
        int denominator = 0;
        int numerator = 0;
        int result = 0;
        
        try {
            myInput = JOptionPane.showInputDialog("Enter an Integer numerator "); 
            numerator = Integer.parseInt(myInput); 
            myInput = JOptionPane.showInputDialog("Enter an integer as a denominator"); 
            denominator = Integer.parseInt(myInput); 
            result = numerator/denominator; 
        }catch(ArithmeticException ae){
            System.err.println("You cannot have a denominator of 0");
            System.err.println("exception;" + ae);
            System.exit(1); 
        }catch(NumberFormatException nfe){
            System.err.println("You must enter an integer"); 
            System.err.println("Exception;" + nfe);
            System.exit(1);             
        }
        
        System.out.println("result" + numerator + "/" + denominator + "=" + result);
    }
    
}
