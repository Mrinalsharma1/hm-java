import java.util.Scanner;
// import java.io.File;
import java.io.FileNotFoundException;
// import java.io.PrintStream;

public class Unsafepassword14 {
    public static void main(String[] args) {

        // If you want to read from a file and output to a file, uncomment the following
        // lines:
        // System.setIn(new FileInputStream("input10.txt"));
        // System.setOut(new PrintStream(new FileOutputStream("output10.txt")));

        Scanner scanner = new Scanner(System.in);

        long L = scanner.nextLong();
        long R = scanner.nextLong();
        scanner.close();

        if (L > 1e18 || R > 1e18 || L > R) {
            throw new RuntimeException("Invalid Input");
        }

        while (L % 10 != firstDigit(L)) {
            L++;
        }
        while (R % 10 != firstDigit(R)) {
            R--;
        }

        long ret = 0;
        while (L <= R && L < 10) {
            ret++;
            L++;
        }

        if (L <= R) {
            L /= 10;
            R /= 10;
            ret += R - L + 1;
        }

        System.out.println(ret);
    }

    public static int firstDigit(long x) {
        while (x > 9) {
            x /= 10;
        }
        return (int) x;
    }
}
