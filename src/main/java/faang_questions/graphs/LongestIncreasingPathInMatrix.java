/*
You are given an m x n integer matrix matrix. Your task is to find the length of the longest increasing path in the matrix.

From each cell, you can move in four directions: up, down, left, or right. You may not move diagonally or move outside the
 boundary of the matrix.

A path is valid if the next cell has a strictly greater value than the current cell.

input

Input: matrix = [
  [9, 9, 4],
  [6, 6, 8],
  [2, 1, 1]
]
1<= m = ? 
1<= n = ?
int datatype
start ={0,0}
vlaue[start] = ?

Output: 4

Explanation: The longest increasing path is [1, 2, 6, 9].
*/

package faang_questions.graphs;

public class LongestIncreasingPathInMatrix {

    private int[][] graph;
    
    private int m, n;

    LongestIncreasingPathInMatrix(int row, int col){
        this.m = row;
        this.n = col;
        this.graph = new int[m][n];
    }

    public void addRows(int row, int[] rows){
        if(row<0 || row>=m) System.out.println("Invalid row provided!");
        for(int i=0; i< n; i++){
            graph[row][i] = rows[i];
        }
    }

    
    public int increasingPath(int[][] graph, int m, int n, int startRow, int startCol){

        

        return 0;
    }

    public int bfs(int[][] graph, int curRow, int curCol, int steps, int m, int n){

        if(curRow<0 || curRow>=m || curCol<0 || curCol>=n){
            return steps;
        }
        int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for(int[] dir : directions){
            bfs(graph, curRow + dir[0], curCol + dir[1], steps, m, n);
        }
        steps++;
    }
    
}
