import java.util.Scanner;
import java.util.Arrays;

public class Minimumamount15 {
    // Function to check if a number is good
    static boolean good(long n, boolean[] like) {
        while (n > 0) {
            long curr = n % 10;
            if (!like[(int) curr]) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        // For input and output handling
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Initialize the like array
        boolean[] like = new boolean[10];
        Arrays.fill(like, true);

        // Update the like array based on input
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            like[x] = false;
        }

        // Find the next good number
        while (!good(n, like)) {
            n++;
        }

        // Print the result
        System.out.println(n);
    }
}
