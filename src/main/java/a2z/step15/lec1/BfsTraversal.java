/*
https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
BFS of graph

*/

package a2z.step15.lec1;

import java.util.*;

public class BfsTraversal {

    /**
     * Performs BFS traversal on the given graph starting from vertex 0.
     * 
     * @param V   Number of vertices in the graph
     * @param adj Adjacency list representation of the graph
     * @return    List of vertices in BFS traversal order
     */
    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfsList = new ArrayList<>();
        if (adj == null || V == 0) return bfsList;

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from node 0
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsList.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return bfsList;
    }

    public static void main(String[] args) {
        // Create an instance of BfsTraversal
        BfsTraversal bfsTraversal = new BfsTraversal();

        // Example graph:
        // 0 -> 1, 2
        // 1 -> 0, 3
        // 2 -> 0
        // 3 -> 1
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);

        adj.get(2).add(0);

        adj.get(3).add(1);

        // Perform BFS traversal
        ArrayList<Integer> bfsResult = bfsTraversal.bfs(V, adj);

        // Print BFS traversal result
        System.out.println("BFS Traversal starting from node 0:");
        for (int node : bfsResult) {
            System.out.print(node + " ");
        }
    }
}

