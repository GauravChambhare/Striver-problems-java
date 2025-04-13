/*
 * http://geeksforgeeks.org/problems/graph-and-vertices/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=graph-and-vertices
 * Given an integer n representing number of vertices. Find out how many undirected graphs (not necessarily connected) can be constructed out of a given n number of vertices.
 * 
 * 
*/

package a2z.step15.lec1;

public class GraphAndTypes {

    // Function to calculate number of undirected graphs
    public static long countUndirectedGraphs(int n) {
        int edges = (n * (n - 1)) / 2;
        return (long) Math.pow(2, edges);
    }

    // Main method to test the function locally
    public static void main(String[] args) {
        int n = 4; // Change n as needed
        long result = countUndirectedGraphs(n);
        System.out.println("Number of undirected graphs for " + n + " vertices: " + result);
    }
}
