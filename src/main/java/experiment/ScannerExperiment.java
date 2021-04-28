package experiment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerExperiment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String[] cde = sc.nextLine().split(" ");
            int c = Integer.parseInt(cde[0]);
            int d = Integer.parseInt(cde[1]);
            int e = Integer.parseInt(cde[2]);
            String line = sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            System.out.println("line = " + line);
            System.out.println("arr = " + Arrays.toString(arr));
        }
        sc.close();
    }
}

