import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Prompt for size
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        // Outer loop for rows
        for (int row = 1; row <= size; row++) {
            // Inner loop for columns
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
