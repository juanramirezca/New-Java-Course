import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {
        /*
        1. Prompting information from the user.
        So far we have seen that we can assign a value to a variable, but it is a fixed value.
        If we want to assign a value that the user suggests, we can import the Scanner library and create
        an instance to input information. The syntax is as follows:
        Scanner <variable name> = new Scanner(System.in)
        And then we have to use the corresponding method of the Scanner class.

        Here's a list of some commonly used methods of the Scanner class:

        - `nextInt()`: Reads an int value.
        - `nextDouble()`: Reads a double value.
        - `nextFloat()`: Reads a float value.
        - `nextLong()`: Reads a long value.
        - `next()`: Reads a single word (string) until a space is encountered.
        - `nextLine()`: Reads an entire line (string) including spaces.
        - `nextBoolean()`: Reads a boolean value (true or false).
        */

        // Create a Scanner instance
        Scanner sc = new Scanner(System.in);

        // Example 1. Asking an integer value from the user
        int firstValue;
        System.out.println("Give me an integer value!");
        firstValue = sc.nextInt();
        System.out.println("The integer value that you typed is: " + firstValue);

        // Example 2. Asking for a name from the user
        String name;
        System.out.println("Give me your name!");
        name = sc.next();
        System.out.println("Your name is " + name);

        // Example 3. Asking for a floating-point number
        System.out.println("Give me a decimal value!");
        float decimalValue = sc.nextFloat();
        System.out.println("The decimal value you typed is: " + decimalValue);

        // Example 4. Asking for a whole line of text
        System.out.println("Give me a full sentence!");
        sc.nextLine(); // Consume the newline left-over
        String sentence = sc.nextLine();
        System.out.println("The sentence you typed is: " + sentence);

        // Example 5. Asking for a boolean value
        System.out.println("Do you like Java? (true/false)");
        boolean likesJava = sc.nextBoolean();
        System.out.println("Your answer was: " + likesJava);

        // Example 6. Asking for a double value
        System.out.println("Give me a double value!");
        double doubleValue = sc.nextDouble();
        System.out.println("The double value you typed is: " + doubleValue);

        // Example 7. Asking for a long value
        System.out.println("Give me a large number!");
        long largeNumber = sc.nextLong();
        System.out.println("The large number you typed is: " + largeNumber);

        /*
        2. Closing the Scanner
        After you have finished using the Scanner, it is good practice to close it to free up resources.
         */
        sc.close();

        /*
        3. Exercises.
        1. Write a program that asks the user for two integer values and then displays their sum, difference, product, and quotient.
        2. Ask the user for their birth year and calculate their age based on the current year.
        3. Write a program that converts an amount in one currency to another.
            For example, ask the user for an amount in USD and convert it to EUR using a fixed conversion rate.
         */
    }
}
