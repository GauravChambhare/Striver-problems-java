/*
https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
DFS traversal
*/

package a2z.step15.lec1;

import java.util.ArrayList;
import java.util.List;

public class DfsTraversal {
    
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                dfsTraversal(i, visited, ans, adj);
            }
        }
        return ans;
    }

    public void dfsTraversal(int n, boolean[] visited, List<Integer> ans, ArrayList<ArrayList<Integer>> adj) {
        visited[n] = true;
        ans.add(n);
        List<Integer> sublist = adj.get(n);
        for(Integer i : sublist){
            if(!visited[i]){
                dfsTraversal(i, visited, ans, adj);
            }
        }
    }

    public static void main(String[] args) {
        // Example graph represented as adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(2, 3, 1)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(0, 4)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(2)));

        DfsTraversal dfsTraversal = new DfsTraversal();
        ArrayList<Integer> result = dfsTraversal.dfs(adj);
        System.out.println("DFS Traversal: " + result);
    }
}