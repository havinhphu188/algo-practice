package teko;

import java.util.*;

public class Access {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, String> fullToAbbr = new HashMap<>();
        fullToAbbr.put("read", "R");
        fullToAbbr.put("write", "W");
        fullToAbbr.put("execute", "X");

        Map<String, Set<String>> fileAuthor = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
//            System.out.println("input = " + input);
            String[] arr = input.split(" ");
            Set<String> listOfOperation = new HashSet<>();
            for (int j = 1; j < arr.length; j++) {
                listOfOperation.add(arr[j]);
            }
            fileAuthor.put(arr[0], listOfOperation);
        }
        int m = in.nextInt();
        in.nextLine();
//        System.out.println("m = " + m);
        for (int i = 0; i < m; i++) {
            String input = in.nextLine();
//            System.out.println("input = " + input);
            String[] arr = input.split(" ");
            if (fileAuthor.get(arr[1]).contains(fullToAbbr.get(arr[0]))) {
                System.out.println("OK");
            }else System.out.println("Access denied");
        }
    }
}
