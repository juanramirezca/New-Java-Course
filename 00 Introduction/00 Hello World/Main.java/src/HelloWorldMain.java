public class HelloWorldMain {

    public static void main(String[] args) {
        /*
          1. In Java, to print, show, or display information to the user, we can use the
          following statements:
         */

        // Example 1: Printing "Hello, World!" with a newline.
        System.out.println("Hello, World!");

        // Example 2: Printing "Goodbye, World!" without adding a newline.
        System.out.print("Goodbye, World!");

        /*
          Notice the difference between the two examples above:
          - `System.out.println` prints the message and then moves to a new line.
          - `System.out.print` prints the message without moving to a new line.

          We can also display the result of an operation. When doing so, we do not use
          double quotes around the values inside the parentheses.
         */

        // Example 3: Printing the result of a multiplication.
        System.out.println(3 * 4);

        /*
          1.1 Newline and concatenation symbols:
          There are certain symbols that are useful when printing in Java:

          Newline symbol: '\n'
          - If we want to print a message and then add a new line, we use the '\n' symbol
            within the string.

          Concatenation symbol: '+'
          - When printing, we can use the '+' symbol to concatenate (join) different values.
         */

        // Example 4: Using the newline symbol.
        System.out.println("Hello, World!\nGoodbye, World!");

        // Example 5: Using the concatenation symbol.
        System.out.println("This is the result: " + 3 * 4);

        /*
          Exercises:
          1. Print the result of computing 8 * 5.
          2. Print the result of computing 8 + 2 * 5.
          3. Display the following string: "8 * 5 = 40".
          4. Print the following: "The result is" followed by the result of 8 * 5.
         */
    }
}
