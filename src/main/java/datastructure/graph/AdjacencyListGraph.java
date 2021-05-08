package datastructure.graph;
import java.util.ArrayList;

class AdjacencyListGraph {
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

    public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
            if(list.get(i).size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list.get(i).size(); j++) {
                    System.out.print(list.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}