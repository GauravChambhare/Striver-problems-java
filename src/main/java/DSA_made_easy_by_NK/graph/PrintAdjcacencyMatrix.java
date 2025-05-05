package DSA_made_easy_by_NK.graph;

public class PrintAdjcacencyMatrix {

public class Graph{

private int[][] adjMatrix;
private int V;

public Graph(int V){
this.V = V;
this.adjMatrix = new int[V][V];
}

public boolean checkEdge(int[] edge){
if(adjMatrix[edge[0]][edge[1]]==0 && adjMatrix[edge[1]][edge[0]]==0) return false;
else return true;
}
// In Java, when you create a 2D array of type int, all elements are automatically initialized to 0 by default, so you do not need to use any loops to set the values to zero manually
public void addEdge(int[] edge){
if(!checkEdge(edge)){
adjMatrix[edge[0]][edge[1]] = 1;
adjMatrix[edge[1]][edge[0]] = 1;
}
else System.out.println("Edge already added.");
return;
}

public void removeEdge(int[] edge){
if(checkEdge(edge)){
adjMatrix[edge[0]][edge[1]] = 1;
adjMatrix[edge[1]][edge[0]] = 1;
}
return;
}

public void printGraph() {
for (int i = 0; i < V; i++) {
System.out.print("| ");
for (int j = 0; j < V; j++) {
System.out.print(adjMatrix[i][j] + " ");
}
System.out.print("|");
System.out.println();
}
}
}

public static void main(String[] args) {
int V = 5;
PrintAdjcacencyMatrix pam = new PrintAdjcacencyMatrix();
PrintAdjcacencyMatrix.Graph graph = pam.new Graph(V);
int[][] edges = {
{0, 1}, {0, 4}, {4, 1}, {4, 3}, {1, 3}, {1, 2}, {3, 2}
};
for (int[] edge : edges) {
graph.addEdge(edge); // Assuming addEdge can handle int[] input
}

graph.printGraph();
}
}

