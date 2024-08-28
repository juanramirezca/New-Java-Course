public class VariablesMain {
    public static void main(String[] args) {

        /* 1. Variables.
        Variables are used to store values. In Java, a variable is declared using the following syntax:
        <type of variable> <name of variable> = value;
        */

        // Example 1: Declaring an integer variable
        int number = 10;

        /*
        The process above is called "declaration" (defining a variable and assigning a value).
        You can also change the value of a variable at any time.
        */

        number = 15; // This process is called "assignment".

        // Exercise 1: Create two integer variables and assign values to them.

        /*
        2. Naming a Variable.
        When naming a variable, there are several rules and conventions:
        - You can use a combination of letters, numbers, the dollar symbol ($), and underscores (_).
        - A variable name cannot start with a number.
        - A variable's name cannot be a keyword (like 'public', 'class', 'System', etc.).
        - Variables are typically named in camelCase.
        - Variable names should be meaningful and descriptive.
        */

        // Example 2: Bad examples of variable names
        int x, y, z;

        // Example 3: Good examples of variable names
        int base, height, triangleArea;

        /*
        3. Variable Types.
        Java has 8 primitive data types, each representing different kinds of values.

        3.1 byte (1 byte): Represents numbers from -128 to 127.
        3.2 short (2 bytes): Represents numbers from -32,768 to 32,767.
        3.3 int (4 bytes): Represents numbers from -2^31 to 2^31-1.
        3.4 long (8 bytes): Represents numbers from -2^63 to 2^63-1.
        These types are used for numbers without a decimal part.

        3.5 float (4 bytes): Represents numbers with a fractional part, up to 7 decimal digits.
        3.6 double (8 bytes): Represents numbers with a fractional part, up to 15 decimal digits.
        These types are used for numbers with a decimal part.

        3.7 char (2 bytes): Represents a single character (e.g., 'a', '1', '@').
        3.8 boolean (1 byte): Represents a truth value (true or false).
        */

        // Example 4: Variables for numbers without a decimal part
        byte totalGoals = 8;
        short numberOfStudents = 256;
        int accountBalance = 56800;
        long nationalDebt = 15391910L;

        // Example 5: Variables for numbers with a decimal part
        float finalScore = 8.7F;
        double averageScore = 9.8;

        // Example 6: Boolean and char variables
        char gender = 'F';
        boolean isOn = true;

        // Exercise 2: Create two variables and print the sum of them.


        /* 4. Exercises.
         * 1. Compute the area of a triangle with a base of 10 cm and a height of 15 cm.
         *    Area = (base * height) / 2
         * 2. Compute the area of a circle with a radius of 5.
         *    Area = π * r^2
         * 3. Compute the average of three scores: 8.5, 7.2, and 9.3.
         *    Average = (8.5 + 7.2 + 9.3) / 3
         * 4. Convert a given temperature from Celsius to Fahrenheit.
         *    Fahrenheit = (9.0 / 5.0) * Celsius + 32
         * 5. Suppose you and two friends go out to dinner and the bill is $213.50 USD.
         *    You decide to leave a tip of 15%.
         *    A) Calculate the tip amount.
         *    B) Calculate the total amount to pay (a bill + tip).
         *    C) Calculate the amount each person should pay (assuming an equal split).
         */
    }
}
