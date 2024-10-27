# PartyInheritanceDemo

**PartyInheritanceDemo** is a Java project designed to demonstrate basic Object-Oriented Programming (OOP) principles, particularly **inheritance**. The project consists of two classes: `Party` (the base class) and `DinnerParty` (a subclass), showcasing how fields and methods are inherited and extended. This project follows the **Allman style** for code formatting and includes input handling using `try-catch` blocks.

## Project Structure

```
/Solution
    ├── Party.java         // Base class for general party
    ├── DinnerParty.java   // Subclass of Party for dinner-specific details
    └── PartyDemo.java     // Main class demonstrating usage
```

## Features

1. **Party Class**:
   - Manages the number of guests for a general party.
   - Methods to set and get the number of guests.
   - Displays basic party information.

2. **DinnerParty Class**:
   - Inherits from `Party` and extends functionality by adding courses for a dinner party.
   - Methods to set and get the number of courses.
   - Displays detailed dinner party information including guests and courses.

3. **PartyDemo Class**:
   - The main class that interacts with the user.
   - Takes input for the number of guests and courses.
   - Demonstrates inheritance by showing how `DinnerParty` can reuse and extend `Party` functionality.

## Code Style

This project adheres to the **Allman style**:
- **Braces** are placed on their own line to improve readability.
- Each method and logic block is clearly separated with comments.
  
Example:
```java
public void displayParty() 
{
    System.out.println("This is a party with " + guests + " guests.");
}
```

## Exception Handling

The project includes **input validation** to gracefully handle invalid inputs (such as entering non-numeric values when numbers are expected):
- `try-catch` blocks are used in the main class (`PartyDemo.java`) to capture and handle exceptions like `InputMismatchException`.

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/party-inheritance-demo-java-project.git
   ```

2. Navigate to the `Solution` package and run the project:
   ```bash
   cd Solution
   javac PartyDemo.java
   java Solution.PartyDemo
   ```

3. Follow the prompts to enter the number of guests and courses for the party and dinner party.

## Example Output

```
Enter number of guests for the party: 5
This is a party with 5 guests.

Enter number of guests for the dinner party: 8
Enter number of courses for the dinner party: 3
This is a dinner party with 8 guests and 3 courses.
```

If invalid input is provided (e.g., text instead of numbers), the program will catch the error:
```
Error: Please enter valid numeric values.
```

## Contributing

Feel free to fork this repository and make your own contributions. You can submit pull requests with new features, improvements, or bug fixes.

## License

This project is licensed under the MIT License.
