/*
   https://leetcode.com/problems/find-if-path-exists-in-graph/
   971. Find if Path Exists in Graph
   There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or 
false otherwise.
*/

package a2z.step15.lec1;

import java.util.ArrayList;

public class FindIfPathExistsinGraph {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Build adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Add edges (undirected graph)
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited);
    }

    // Helper DFS method
    private boolean dfs(ArrayList<ArrayList<Integer>> graph, int current, int target, boolean[] visited) {
        if (current == target) return true;
        visited[current] = true;
        
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor] && dfs(graph, neighbor, target, visited)) {
                return true;
            }
        }
        return false;
    }
    /*  -- suing bsf
        public boolean bfs(ArrayList<ArrayList<Integer>> graph, int src, int dst, int n, boolean[] vst){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        vst[src] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            vst[node] = true;
            if(node==dst) return true;
            for(int i : graph.get(node)){
                if(!vst[i]){
                    q.offer(i);
                    vst[i] = true;
                }
            }
        }

        return false;
    }


    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i< n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return bfs(graph, source, destination, n, visited);
    }
    */

    public static void main(String[] args) {
        FindIfPathExistsinGraph pathFinder = new FindIfPathExistsinGraph();
        
        // Test Case 1: Path exists
        int n1 = 6;
        int[][] edges1 = {{0,1}, {0,2}, {3,5}, {5,4}, {4,3}};
        System.out.println("Test Case 1: " + pathFinder.validPath(n1, edges1, 0, 1)); // true
        
        // Test Case 2: No path
        System.out.println("Test Case 2: " + pathFinder.validPath(n1, edges1, 0, 5)); // false
        
        // Test Case 3: Source == Destination
        System.out.println("Test Case 3: " + pathFinder.validPath(3, new int[][]{}, 2, 2)); // true
    }
}
