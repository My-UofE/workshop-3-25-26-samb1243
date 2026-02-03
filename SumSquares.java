import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for start value
        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine(); // Clear any remaining input

        // Prompt for end value
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        int sum = 0;
        int i = startNum;

        // While loop to calculate sum of squares
        while (i <= endNum) {
            sum += i * i;
            i++;
        }

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);
    }
}
