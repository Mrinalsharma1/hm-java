import java.util.*;

public class Candypairs18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = 1;
        while (tests > 0) {
            int N = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            String str = scanner.nextLine();
            String out = solve(N, str);
            System.out.println(out);
            tests--;
        }
    }

    public static String solve(int n, String str) {
        if (n < 1 || n > 10000) {
            throw new RuntimeException("Invalid Input Constraints");
        }

        boolean[] uppercase = new boolean[26];
        boolean[] lowercase = new boolean[26];

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercase[c - 'a'] = true;
            } else if (Character.isUpperCase(c)) {
                uppercase[c - 'A'] = true;
            }
        }

        for (int i = 25; i >= 0; i--) {
            if (uppercase[i] && lowercase[i]) {
                return Character.toString((char) (i + 'A'));
            }
        }

        return "0";
    }
}

// N=6
// candies[] = bBdCcD
