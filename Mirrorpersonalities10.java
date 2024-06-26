import java.util.Scanner;

public class Mirrorpersonalities10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        String s = scanner.nextLine();

        // Input validation
        assert 1 <= n && n <= 100000 : "Input n is out of range";
        assert s.length() == n : "String length does not match n";
        for (char c : s.toCharArray()) {
            assert 'a' <= c && c <= 'z' : "String contains invalid characters";
        }

        System.out.println(solution(n, s));
    }

    public static int solution(int n, String s) {
        int[] a = new int[26];
        int ans = 0;

        for (char i : s.toCharArray()) {
            int ch = i - 'a';
            ans += a[25 - ch];
            a[ch]++;
        }

        return ans;
    }
}
