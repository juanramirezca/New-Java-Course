public class MathematicalOperationMain {
    public static void main(String[] args) {
        /* 1. Mathematical Operators.
        In Java, we have the following symbols that are used to perform basic arithmetic operations:
        addition (+), subtraction (-), multiplication (*), division (/), and modulus operator (%).
        */

        // Example 1: Adding two integer values
        int number1, number2, sumResult;
        number1 = 8;
        number2 = 17;
        sumResult = number1 + number2;
        System.out.println("Sum: " + sumResult);

        // Example 2: Multiplication of two double values
        double value1, value2, multiResult;
        value1 = 8.5;
        value2 = 9.1;
        multiResult = value1 * value2;
        System.out.println("Multiplication: " + multiResult);

        // Example 3: Modulus operator example
        int num1, num2, modResult;
        num1 = 7;
        num2 = 3;
        modResult = num1 % num2;
        System.out.println("Modulus: " + modResult);

        // Exercise 1: Divide two short values

        /*
        2. Mathematical Library Import.
        We can use more advanced mathematical operations if we import the `java.lang.Math` library.
        For example, we can calculate square roots, exponentiation, the minimum or maximum of two values, etc.
        */

        // Example 4: Raising a value to the power of another value
        double valueA = 2, valueB = 5, expResult;
        expResult = Math.pow(valueA, valueB);
        System.out.println("Exponentiation: " + expResult);

        // Exercise 2: Compute the square root of a double value

        /*
        3. Mathematical Precedence.
        In Math, there is a hierarchy of operations called precedence, and it's also used in Java:

        1. Parentheses ()
        2. Exponentiation (e.g., Math.pow)
        3. Multiplication (*), division (/), and modulus (%)
        4. Addition (+) and subtraction (-)
        */

        // Example 5: Parentheses first
        int firstResult = (8 + 7) * 5 / 2;
        System.out.println("With parentheses: " + firstResult);

        // Example 6: Multiplication and division first
        int secondResult = 5 + 8 * 7 - 3 / 2;
        System.out.println("Multiplication and division first: " + secondResult);

        // Example 7: Same precedence
        int thirdResult = 5 + 8 + 3 - 2 - 8 + 5;
        System.out.println("Same precedence: " + thirdResult);

        /*
        4. Exercises
        1. Compute the number of minutes in one day.
        2. Calculate the sum of the first 5 numbers (1 + 2 + 3 + 4 + 5).
        3. Find the minimum and maximum of two numbers using `Math.min()` and `Math.max()`.
        4. Suppose that 1 dollar is equal to 19.67 pesos. How many pesos will I get if I exchange 32 dollars?
         */

    }
}
