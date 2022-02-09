package teko;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            Set<Integer> set = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
//            System.out.println("n = " + n);
//            System.out.println("m = " + m);

            for (int j = 0; j < n; j++) {
                int num = in.nextInt();
//                System.out.println("num = " + num);
                set.add(num);
            }
//            System.out.println("-------------");
            for (int j = 0; j < m; j++) {
                int num = in.nextInt();
//                System.out.println("num = " + num);
                set.add(num);
            }

            Integer[] array = set.toArray(new Integer[0]);
            Arrays.sort(array);
//            System.out.println("array = " + Arrays.toString(array));
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
