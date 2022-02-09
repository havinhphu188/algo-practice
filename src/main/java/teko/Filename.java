package teko;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Filename {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String input  = in.nextLine();
            String genName = input;
            boolean flag = false;
            String prevString = genName;
            while (map.containsKey(genName)){
                flag = true;
                prevString = genName;
                genName = genName + "(" + (map.get(genName) + 1) +")";
            }
            if (flag) map.put(prevString, map.get(prevString) + 1);
            System.out.println(genName);
            map.put(genName, 0);
        }
    }
}
