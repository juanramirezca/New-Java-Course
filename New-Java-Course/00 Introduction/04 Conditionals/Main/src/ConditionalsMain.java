public class ConditionalsMain {
    public static void main(String[] args) {
        /*
        1. Relational Operators.
        Relational operators in Java are used to compare two operands. They return a boolean value (true or false).
        - Greater than (>)
        - Less than (<)
        - Equal to (==)
        - Not equal to (!=)
        - Greater than or equal to (>=)
        - Less than or equal to (<=)
        */
        // Example 1: Checking if 8 is greater than 5
        System.out.println("Is 8 > 5? " + (8 > 5));

        // Example 2: Checking if 8 is equal to 5
        System.out.println("Is 8 == 5? " + (8 == 5));

        /*
        2. Truth Tables.
        Logical operations can be represented using truth tables.

         LOGICAL AND (&&)          LOGICAL OR (||)       LOGICAL NOT (!)
       *---*---*---------*       *---*---*--------*      *---*-------*
       | p | q | p and q |       | p | q | p or q |      | p | not p |
       *---*---*---------*       *---*---*--------*      *---*-------*
       | T | T |    T    |       | T | T |    T   |      | T |   F   |
       | T | F |    F    |       | T | F |    T   |      | F |   T   |
       | F | T |    F    |       | F | T |    T   |      *---*-------*
       | F | F |    F    |       | F | F |    F   |
       *---*---*---------*       *---*---*--------*
        */

        /*
        3. Logical Operators
        Logical operators in Java are:
        - AND (&&)
        - OR (||)
        - NOT (!)
        */

        // Example 1: Checking if a score is within a valid range
        int score = 8;
        boolean validScore = (score > 0) && (score < 10);
        System.out.println("Is it a valid score? " + validScore);

        /*
        4. Conditional Statements.
        Conditional statements allow us to execute certain blocks of code based on specific conditions.
        The basic structure of an if-statement is:

        if (condition) {
            statement(s);
        }
        */

        // Example 2: Checking if someone is able to vote
        int age = 18;
        if (age >= 18) {
            System.out.println("Can vote");
        }

        // Example 3: Checking if a number is positive
        int number = 8;
        if (number > 0) {
            System.out.println("Is positive");
        }

        // Exercise 1: Determine if a switch is on

        /*
        5. Else Statement
        The else statement is used to specify a block of code that will be executed if the condition is false.

        if (condition) {
            true statement;
        } else {
            false statement;
        }
        */

        // Example 4: Determining if a number is even or odd
        int num = 17;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Example 5: Checking if a student passed or failed an exam
        int grade = 6;
        if (grade >= 6) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Exercise 2: Determine if a number is positive or negative


        /*
        6. Nested if-else Statement
        A nested if-else statement is used when we have multiple conditions to check.

        if (condition1) {
            statement1;
        } else if (condition2) {
            statement2;
        } else if (condition3) {
            statement3;
        } else {
            default statement;
        }
        */

        // Example 6: Determine if a number is positive, negative, or zero
        int anotherNumber = -4;
        if (anotherNumber > 0) {
            System.out.println("Positive");
        } else if (anotherNumber < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Equal to zero");
        }

        /*
        7. Ternary Operator
        The ternary operator is a shorthand for if-else statements. It has the form:
        condition ? expression1: expression2;
        */

        // Example 7: Using the ternary operator to check if a number is even or odd
        int checkNum = 10;
        String result = (checkNum % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        /*
        8. Exercises
        1. Write a program to check if a given number is a multiple of 5.
        2. Write a program to calculate the discount based on the purchase amount
           (10% discount in case amount > 1000, otherwise no discount).
        3. Create a program that prints whether it is a weekday or a weekend day.
        4. Given three values, determine which one is the largest.
        5. Determine if a number is divisible by three, five, or both.
        6. Given the age of a person, determine if it is a baby (0-2), a kid (3-11), a teenager (12-19), or an adult.
        7. Create a program that, given an income, computes the corresponding tax that an employee must pay. Use the following table:
            | Salary   | Tax  |
            |----------|------|
            | < 100    | 10%  |
            | < 1000   | 15%  |
            | < 10000  | 20%  |
            | >= 10000 | 25%  |
        **Extra exercise.**
        Create a program to categorize the BMI (Body Mass Index) of a person as underweight, normal, overweight, or obese based on their BMI value.
         */
    }
}
