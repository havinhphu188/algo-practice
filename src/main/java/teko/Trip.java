package teko;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();

        System.out.println(solve(n,v));
    }

    public static int solve(int n, int v) {
        if (n - 1 <= v) return (n - 1);
        int sum = v;
//        System.out.println("(n-v) = " + (n-v));
            for (int i = 2; i < n - v + 1; i++) {
//            System.out.println("i = " + i);
                sum += i;
            }
        return sum;
    }

}
