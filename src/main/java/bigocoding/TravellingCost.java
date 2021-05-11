package bigocoding;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

//https://www.spoj.com/problems/TRVCOST/
public class TravellingCost {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        AdjacencyListGraph graph = new AdjacencyListGraph(500);

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();
            graph.addEdge(a, b, w);
        }

        int u = in.nextInt();
        int[] result = solution(graph, u);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int v = in.nextInt();
            if (result[v] == Integer.MAX_VALUE) {
                System.out.println("NO PATH");
            }else{
                System.out.println(result[v]);
            }

        }

    }

    private static int[] solution(AdjacencyListGraph graph, int u) {
        int[] dist = new int[graph.list.size()];
        int[] prev = new int[graph.list.size()];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[u] = 0;

        Node source = new Node(u, 0);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(source);

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            graph.list.get(current.id).forEach(adjPair->{
                if (dist[current.id] + adjPair.weight < dist[adjPair.verticle]) {
                    dist[adjPair.verticle] = dist[current.id] + adjPair.weight;
                    pq.add(new Node(adjPair.verticle, dist[adjPair.verticle]));
                    prev[adjPair.verticle] = current.id;
                }
            });
        }
        return dist;
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
            for (int i = 0; i < vertex ; i++) {
                list.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination, int weight){
            //add edge
            list.get(source).add(new Pair(destination,weight));
            list.get(destination).add(new Pair(source,weight));
        }

    }
}
