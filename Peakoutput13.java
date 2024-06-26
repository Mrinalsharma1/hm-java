import java.util.Scanner;

public class Peakoutput13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] workload = new int[N];
        for (int i = 0; i < N; i++) {
            workload[i] = scanner.nextInt();
        }
        scanner.close();

        try {
            int out = solve(N, workload);
            System.out.println(out);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int solve(int n, int[] hours) {
        if (n < 1 || n > 100000) {
            throw new RuntimeException("Invalid Input");
        }

        int i = 0;
        int ans = 0;

        while (i < n) {
            if (hours[i] > 6) {
                int a = 1;
                while (i + 1 < n && hours[i + 1] > 6) {
                    a++;
                    i++;
                }
                ans = Math.max(ans, a);
            }
            i++;
        }

        return ans;
    }
}
