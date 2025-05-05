/*
https://leetcode.com/problems/count-the-number-of-complete-components/
2685. Count the Number of Complete Components

You are given an integer n. There is an undirected graph with n vertices, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting vertices ai and bi.

Return the number of complete connected components of the graph.

A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.

A connected component is said to be complete if there exists an edge between every pair of its vertices.
*/

package a2z.step15.lec1;

import java.util.*;

public class CountTheNumberOfConnectedComponents {

    public int countCompleteComponents(int n, int[][] edges) {
        int ans = 0;
        boolean[] visited = new boolean[n];
        List<List<Integer>> adjList = buildAdjList(n, edges);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, visited, adjList, component);
                if (isComplete(component, adjList)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private List<List<Integer>> buildAdjList(int V, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        return adjList;
    }

    private void dfs(int v, boolean[] visited, List<List<Integer>> adjList, List<Integer> component) {
        visited[v] = true;
        component.add(v);
        for (Integer neighbor : adjList.get(v)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adjList, component);
            }
        }
    }

    private boolean isComplete(List<Integer> component, List<List<Integer>> adjList) {
        int size = component.size();
        int edgeCount = 0;

        for (int node : component) {
            edgeCount += adjList.get(node).size();
        }

        edgeCount /= 2;

        return edgeCount == (size * (size - 1)) / 2;
    }

    public static void main(String[] args) {
        CountTheNumberOfConnectedComponents obj = new CountTheNumberOfConnectedComponents();
        
        // Example 1
        int[][] edges1 = {{0, 1}, {0, 2}, {1, 2}, {3, 4}};
        int result1 = obj.countCompleteComponents(6, edges1);  // here n= 5 whill remain single so total com[plete component = 3]
        System.out.println("Output: " + result1);  // Expected: 3

        // Example 2
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 0}, {3, 4}, {4, 5}, {5, 3}};
        int result2 = obj.countCompleteComponents(6, edges2);
        System.out.println("Output: " + result2);  // Expected: 2
    }
}
