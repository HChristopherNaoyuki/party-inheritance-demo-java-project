// File: /Solution/Party.java
package Solution;

// Party class represents a general party with guests and simple methods
public class Party 
{
    // Number of guests at the party
    private int guests;

    // Constructor for Party class
    public Party() 
    {
        guests = 0; // Default number of guests is 0
    }

    // Set the number of guests for the party
    public void setGuests(int numGuests) 
    {
        guests = numGuests;
    }

    // Get the number of guests for the party
    public int getGuests() 
    {
        return guests;
    }

    // Display a message about the party
    public void displayParty() 
    {
        System.out.println("This is a party with " + guests + " guests.");
    }
}

