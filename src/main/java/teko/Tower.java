package teko;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tower {
    static Set<Integer> checkpoint;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        checkpoint = new HashSet<>();
        int max = 0;
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            if (n > max) max = n;
            input.add(n);
        }
        solve(max);
        for (int i = 0; i < q; i++) {
            System.out.println(checkpoint.contains(input.get(i))?"YES":"NO");
        }
    }

    public static void solve(int n) {
        int sum = 0;
        int level = 1;
        while (sum < n) {
            sum += level;
//            System.out.println("sum = " + sum);
            checkpoint.add(sum);
            level++;
        }
    }
}
