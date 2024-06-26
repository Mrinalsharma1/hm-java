import java.util.*;

public class Chocolatestack19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        // Call the solution function and print the result
        List<Integer> result = solution(n, c);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> solution(int n, int[] c) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i : c) {
            if (i != 0) {
                s.push(i);
            } else {
                ans.add(s.pop());
            }
        }
        return ans;
    }
}
