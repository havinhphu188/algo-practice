package experiment;

import java.util.Arrays;
import java.util.Scanner;

/*
2
3
4 5 6
fwefwef
3 8 9
*/

public class ScannerExperiment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            in.nextLine();
            String line = in.nextLine();
            String[] arr = in.nextLine().split(" ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            System.out.println("line = " + line);
            System.out.println("arr = " + Arrays.toString(arr));
        }
        in.close();
    }
}

