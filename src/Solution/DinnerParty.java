// File: /Solution/DinnerParty.java
package Solution;

// DinnerParty is a subclass of Party, representing a more specific type of party
public class DinnerParty extends Party 
{
    // Variable to hold the number of courses for the dinner
    private int courses;

    // Constructor for DinnerParty class
    public DinnerParty() 
    {
        super(); // Calls the Party class constructor
        courses = 0; // Default number of courses is 0
    }

    // Set the number of courses for the dinner party
    public void setCourses(int numCourses) 
    {
        courses = numCourses;
    }

    // Get the number of courses for the dinner party
    public int getCourses() 
    {
        return courses;
    }

    // Display a message about the dinner party
    public void displayDinnerParty() 
    {
        System.out.println("This is a dinner party with " + getGuests() + " guests and " + courses + " courses.");
    }
}

