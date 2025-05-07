/*
https://leetcode.com/problems/is-graph-bipartite/
785. Is Graph Bipartite?
There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to. More formally, for each v in graph[u], there is an undirected edge between node u and node v. The graph has the following properties:

There are no self-edges (graph[u] does not contain u).
There are no parallel edges (graph[u] does not contain duplicate values).
If v is in graph[u], then u is in graph[v] (the graph is undirected).
The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.

Return true if and only if it is bipartite.
*/

package a2z.step15.lec2;

import java.util.*;

public class IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1); // -1 means unvisited

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfs(graph, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfs(int[][] graph, int start, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        color[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph[node]) {
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    queue.offer(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        IsGraphBipartite bipartiteChecker = new IsGraphBipartite();

        int[][] graph1 = {{1, 3}, {0, 2}, {1, 3}, {0, 2}}; // Bipartite
        int[][] graph2 = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}; // Not Bipartite

        System.out.println("Graph 1 is bipartite? " + bipartiteChecker.isBipartite(graph1)); // true
        System.out.println("Graph 2 is bipartite? " + bipartiteChecker.isBipartite(graph2)); // false
    }
}
