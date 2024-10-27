// File: /Solution/PartyDemo.java
package Solution;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PartyDemo 
{
    public static void main(String[] args) 
    {
        // Create a scanner to get user input
        Scanner input = new Scanner(System.in);
        
        try 
        {
            // Create a Party object
            Party myParty = new Party();
            System.out.print("Enter number of guests for the party: ");
            int numGuests = input.nextInt();
            myParty.setGuests(numGuests);
            myParty.displayParty(); // Display details of the party
            
            // Create a DinnerParty object
            DinnerParty myDinnerParty = new DinnerParty();
            System.out.print("Enter number of guests for the dinner party: ");
            numGuests = input.nextInt();
            myDinnerParty.setGuests(numGuests);
            
            System.out.print("Enter number of courses for the dinner party: ");
            int numCourses = input.nextInt();
            myDinnerParty.setCourses(numCourses);
            
            myDinnerParty.displayDinnerParty(); // Display details of the dinner party
        } 
        catch (InputMismatchException e) 
        {
            // This block will handle any input mismatch exceptions (like entering non-integer values)
            System.out.println("Error: Please enter valid numeric values.");
        } 
        catch (Exception e) 
        {
            // This block will catch any other unforeseen exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally 
        {
            // Always close the scanner to prevent resource leaks
            input.close();
        }
    }
}

