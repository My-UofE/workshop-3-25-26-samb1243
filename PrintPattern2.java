import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size;

        // Prompt until valid input is entered
        while (true) {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            } else {
                break;
            }
        }

        int dimension = size * 2;

        // Outer loop for rows
        for (int row = 1; row <= dimension; row++) {

            int start;
            if (row <= size) {
                start = row;
            } else {
                start = dimension - row + 1;
            }

            // Ascending part
            for (int i = 0; i < size; i++) {
                System.out.print(start + i);
            }

            // Descending part
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(start + i);
            }

            System.out.println();
        }
    }
}
