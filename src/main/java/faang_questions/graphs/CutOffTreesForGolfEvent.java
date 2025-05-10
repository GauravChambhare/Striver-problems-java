/*
https://leetcode.com/problems/cut-off-trees-for-golf-event/

675. Cut Off Trees for Golf Event

You are asked to cut off all the trees in a forest for a golf event. The forest is represented as an m x n matrix. In this matrix:

0 means the cell cannot be walked through.
1 represents an empty cell that can be walked through.
A number greater than 1 represents a tree in a cell that can be walked through, and this number is the tree's height.
In one step, you can walk in any of the four directions: north, east, south, and west. If you are standing in a cell with a tree, you can choose whether to cut it off.

You must cut off the trees in order from shortest to tallest. When you cut off a tree, the value at its cell becomes 1 (an empty cell).

Starting from the point (0, 0), return the minimum steps you need to walk to cut off all the trees. If you cannot cut off all the trees, return -1.

Note: The input is generated such that no two trees have the same height, and there is at least one tree needs to be cut off.
*/

package faang_questions.graphs;

import java.util.*;

public class CutOffTreesForGolfEvent {

    public int cutOffTree(List<List<Integer>> forest) {
        int stepCount = 0;
        int m = forest.size();
        int n = forest.get(0).size();
        List<int[]> trees = new ArrayList<>();
        
        // Identify the trees
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = forest.get(i).get(j);
                if (val > 1) {
                    trees.add(new int[] {val, i, j});
                }
            }
        }
        
        // Sort trees based on height
        Collections.sort(trees, Comparator.comparingInt(a -> a[0]));

        int startRow = 0;
        int startCol = 0;

        // Traverse the sorted list of trees
        for (int[] tree : trees) {
            int steps = bfs(forest, startRow, startCol, tree[1], tree[2]);
            if (steps == -1) {
                return -1;
            }
            stepCount += steps;
            startRow = tree[1];
            startCol = tree[2];
        }

        return stepCount;
    }

    // BFS to calculate the minimum steps to reach the target tree
    public static int bfs(List<List<Integer>> forest, int startRow, int startCol, int targetRow, int targetCol) {
        int rows = forest.size();
        int cols = forest.get(0).size();
        if (startRow == targetRow && startCol == targetCol) {
            return 0;
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {startRow, startCol});
        int steps = 0;
        boolean[][] visited = new boolean[rows][cols];
        visited[startRow][startCol] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty()) {
            steps++;
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                int[] current = q.poll();
                int currentR = current[0], currentC = current[1];
                for (int[] dir : directions) {
                    int nextR = currentR + dir[0];
                    int nextC = currentC + dir[1];
                    if (nextR >= 0 && nextR < rows && nextC >= 0 && nextC < cols && 
                        !visited[nextR][nextC] && forest.get(nextR).get(nextC) != 0) {
                        if (nextR == targetRow && nextC == targetCol) {
                            return steps;
                        }
                        q.offer(new int[] {nextR, nextC});
                        visited[nextR][nextC] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example input
        List<List<Integer>> forest = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(0, 0, 4),
            Arrays.asList(7, 6, 5)
        );
        /*
        |1, 2, 3|
        |0, 0, 4|
        |7, 6, 5|
        */
        // Create an instance of the class
        CutOffTreesForGolfEvent solution = new CutOffTreesForGolfEvent();

        // Call the cutOffTree function and print the result
        int result = solution.cutOffTree(forest);
        System.out.println("Minimum steps to cut off all trees: " + result);
    }
}