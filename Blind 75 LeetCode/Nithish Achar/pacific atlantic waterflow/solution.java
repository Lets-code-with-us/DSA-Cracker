import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0)
            return result;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] canReachPacific = new boolean[rows][cols];
        boolean[][] canReachAtlantic = new boolean[rows][cols];

        // Start from the edges and mark reachable positions for each ocean
        for (int i = 0; i < rows; i++) {
            dfs(heights, canReachPacific, i, 0, Integer.MIN_VALUE);
            dfs(heights, canReachAtlantic, i, cols - 1, Integer.MIN_VALUE);
        }
        for (int i = 0; i < cols; i++) {
            dfs(heights, canReachPacific, 0, i, Integer.MIN_VALUE);
            dfs(heights, canReachAtlantic, rows - 1, i, Integer.MIN_VALUE);
        }

        // Find positions reachable from both oceans
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    result.add(temp);
                }
            }
        }
        return result;
    }

    // DFS to mark reachable positions from a given ocean
    private void dfs(int[][] heights, boolean[][] visited, int row, int col, int prevHeight) {
        int rows = heights.length;
        int cols = heights[0].length;
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || heights[row][col] < prevHeight)
            return;
        visited[row][col] = true;
        dfs(heights, visited, row + 1, col, heights[row][col]);
        dfs(heights, visited, row - 1, col, heights[row][col]);
        dfs(heights, visited, row, col + 1, heights[row][col]);
        dfs(heights, visited, row, col - 1, heights[row][col]);
    }
}
