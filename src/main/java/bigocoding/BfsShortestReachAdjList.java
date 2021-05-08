package bigocoding;

import java.util.*;

//https://www.hackerrank.com/challenges/bfsshortreach/problem
public class BfsShortestReachAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int j = 0; j < q; j++) {
            sc.nextLine();
            String[] mn = sc.nextLine().split(" ");
            int n = Integer.parseInt(mn[0]);
            int m = Integer.parseInt(mn[1]);
            AdjacencyListGraph graph = new AdjacencyListGraph(n + 1);
            for (int i = 0; i < m; i++) {
                String[] uv = sc.nextLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                graph.addEdge(u, v);
            }
            int s = sc.nextInt();
            Integer[] result = solution(n, graph, s);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static Integer[] solution(int n, AdjacencyListGraph graph, int s) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        int[] path = new int[n + 1];
        Arrays.fill(path, -1);
        Arrays.fill(visited, false);
        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int currentV = queue.poll();
            graph.list.get(currentV).forEach(adjV -> {
                if ((!visited[adjV])) {
                    queue.add(adjV);
                    visited[adjV] = true;
                    path[adjV] = currentV;
                }
            });
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (i == s) continue;
            if (path[i] == -1) {
                result.add(-1);
            } else {

                int j = i;
                int distant = 0;
                while (path[j] != -1) {
                    distant++;
                    j = path[j];
                }

                result.add(distant * 6);
            }
        }

        return result.stream().toArray(Integer[]::new);
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
}

