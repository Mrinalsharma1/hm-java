import java.util.Scanner;

public class Crossnumberpuzzle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = 1; // We can adjust this to test multiple cases if needed
        while (tests > 0) {
            int n = scanner.nextInt();
            try {
                int out = solve(n);
                
                System.out.println(out);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            tests--;
        }
        scanner.close();
    }

    public static int solve(int target) {
        if (target > 1000000000 || target < -1000000000) {
            throw new RuntimeException("Invalid Input Constraints");
        }
        target = Math.abs(target);

        int sum = 0;
        int step = 0;
        while (sum < target || (sum - target) % 2 != 0) {
            step++;
            sum += step;
        }

        return (step * (step + 1)) / 2;
    }
}
