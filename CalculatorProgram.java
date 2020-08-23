
/**
 * Write a description of class CalculatorProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class CalculatorProgram
{
    // main method :- runs when you run the program
    public static void main(String[] args)
    {
        // put your code here
        
        System.out.println("SIMPLE CALCULATOR");        
        showMenu();
        
    }
    
    public static void showMenu()
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Would you like to perform a calculation(y/n)?");
        boolean runMenu= scanner.next().equals("y");
        do{
       
            //enter code to show options and call calculation methods here
            System.out.println("Would you like to perform another calculation(y/n)?");
            runMenu= scanner.next().equals("y");
     }
        while(runMenu);
        System.out.println("Goodbye");
        System.exit(0);
    }
    
    /**
     * Method that takes two integer paramers and returns the sum
     */
    public static int sum( int number1, int number2)
    {
        return 0;
    } 
    
}
