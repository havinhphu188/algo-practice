package experiment;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
2
3
4 5 6
fwefwef
3 8 9
*/
public class MyScannerExperiment {

    static PrintWriter out;

    public static void main(String[] args) {

        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        MyScanner in = new MyScanner();

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            String line = in.nextLine();
            String[] arr = in.nextLine().split(" ");
            out.println("a = " + a);
            out.println("b = " + b);
            out.println("c = " + c);
            out.println("d = " + d);
            out.println("e = " + e);
            out.println("line = " + line);
            out.println("arr = " + Arrays.toString(arr));
        }
    }

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
