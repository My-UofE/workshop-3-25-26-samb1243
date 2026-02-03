import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
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

        double sum = 0.0;
        int count = 0;
        int i = startNum;

        // Do-while loop to calculate sum of squares and count
        do {
            sum += i * i;
            count++;
            i++;
        } while (i <= endNum);

        double average = sum / count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);
    }
}
