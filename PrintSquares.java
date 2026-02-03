import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        /*
        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");
        */

        // Prompt for start value
        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads first int
        in.nextLine(); // Clear any remaining input

        // Prompt for end value
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sequence of squares from " + startNum + " to " + endNum + ":");

        // For loop to print squares
        for (int i = startNum; i <= endNum; i++) {
            System.out.print((i * i) + " ");
        }

        // End the line after loop
        System.out.println();
    }
}
