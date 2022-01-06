package bigocoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.spoj.com/problems/MST/
//Prim
public class MinimumSpaningTree {
    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        int n = in.nextInt();
        int m = in.nextInt();
        AdjacencyListGraph graph = new AdjacencyListGraph(n);

        int s = 0;
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();
            s = b - 1;
            graph.addEdge(a-1, b-1, w);
        }
        System.out.println(solution(graph, s));
    }

    private static int solution(AdjacencyListGraph graph, int u) {
        int[] dist = new int[graph.list.size()];
        int[] prev = new int[graph.list.size()];
        boolean[] visited = new boolean[graph.list.size()];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        Arrays.fill(visited, false);
        dist[u] = 0;

        Node source = new Node(u, 0);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(source);

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            visited[current.id] = true;
            graph.list.get(current.id).forEach(adjPair->{
                if ((adjPair.weight < dist[adjPair.verticle])&&(!visited[adjPair.verticle])) {
                    dist[adjPair.verticle] = adjPair.weight;
                    pq.add(new Node(adjPair.verticle, dist[adjPair.verticle]));
                    prev[adjPair.verticle] = current.id;
                }
            });
        }
        int sum = Arrays.stream(dist).filter(d -> d != Integer.MAX_VALUE).sum();
        return sum;
    }

    static class Pair {
        int verticle;
        int weight;

        public Pair(int verticle, int weight) {
            this.verticle = verticle;
            this.weight = weight;
        }

    }

    static class Node implements Comparable<Node> {
        int id;
        int dist;

        public Node(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return this.dist - o.dist;
        }
    }

    static class AdjacencyListGraph {
        int vertex;
        ArrayList<ArrayList<Pair>> list;

        public AdjacencyListGraph(int vertex) {
            this.vertex = vertex;
            list = new ArrayList(vertex);
            for (int i = 0; i < vertex; i++) {
                list.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination, int weight){
            //add edge
            list.get(source).add(new Pair(destination,weight));
            list.get(destination).add(new Pair(source,weight));
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
