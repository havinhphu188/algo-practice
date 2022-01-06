package bigocoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.spoj.com/problems/CAM5/
//DFS

public class PrayatnaPr {

    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int e = in.nextInt();
            AdjacencyListGraph graph = new AdjacencyListGraph(n);

            for (int j = 0; j < e; j++) {
                int a = in.nextInt();
                int b = in.nextInt();
                graph.addEdge(a, b);
            }

//            graph.printGraph();
            System.out.println(solution(graph, n));
        }
    }

    private static int solution(AdjacencyListGraph graph, int n) {
        int numberOfGroup = 0;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                numberOfGroup++;
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                visited[i] = true;
                while (!stack.empty()){
                    int currentV = stack.pop();
                    graph.list.get(currentV).forEach(adjV->{
                        if (!visited[adjV]){
                            visited[adjV] = true;
                            stack.push(adjV);
                        }
                    });
                }
            }
        }

        return numberOfGroup;
    }

    static class AdjacencyListGraph {
        int vertex;
        ArrayList<ArrayList<Integer>> list;

        public AdjacencyListGraph(int vertex) {
            this.vertex = vertex;
            list = new ArrayList(vertex);
            for (int i = 0; i < vertex ; i++) {
                list.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination){
            //add edge
            list.get(source).add(destination);
            //add back edge ((for undirected)
            list.get(destination).add(source);
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
