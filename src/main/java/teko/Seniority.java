package teko;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seniority {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = in.nextInt();
        }
        int[] sorted = Arrays.copyOf(input, input.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sorted[0], 0);
        for (int i = 1; i < n; i++) {
            if (sorted[i] != sorted[i-1]){
                map.put(sorted[i], i);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(map.get(input[i]) + " ");
        }
//        int[] array = {23, 43, 55, 12};
//        int newLength = array.length;
//
//        int[] copiedArray = Arrays.copyOf(array, newLength);
    }
}
