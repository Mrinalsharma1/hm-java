import java.util.*;

public class Counttheletters17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = 1;
        while (tests > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline
            List<String> words = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                words.add(scanner.nextLine());
            }
            String out = solve(n, words);
            System.out.println(out);
            tests--;
        }
    }

    public static String solve(int n, List<String> words) {
        if (n < 1 || n > 100) {
            throw new RuntimeException("Invalid Input Constraints");
        }

        List<String> a = new ArrayList<>();
        a.add(words.get(0));
        int m = 0;

        for (String word : words) {
            int ans = 0;
            Map<Character, Integer> c = new HashMap<>();

            for (char j : word.toCharArray()) {
                c.put(j, c.getOrDefault(j, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() == 1) {
                    ans++;
                }
            }

            if (m < ans) {
                m = ans;
                a.clear();
                a.add(word);
            } else if (m == ans) {
                a.add(word);
            }
        }

        Collections.sort(a);
        return a.get(0);
    }
}

// input
// 3
// once
// three
// sorry

// output
// once
