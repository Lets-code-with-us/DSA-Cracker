class Solution {
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    final int m = heights.length;//final value of m is length of heights array
    final int n = heights[0].length;//final value of n is the length of 1st element of heights array 
    List<List<Integer>> ans = new ArrayList<>();//create a new ArrayList named ans
    boolean[][] seenP = new boolean[m][n];//we create a seenP boolean matrix of m rows and n columns
    boolean[][] seenA = new boolean[m][n];//we create a seenA boolean matrix of m rows and n columns

    for (int i = 0; i < m; ++i) {//we traverse the m rows 
      dfs(heights, i, 0, 0, seenP);//dfs method is called
      dfs(heights, i, n - 1, 0, seenA);//dfs method is called again
    }

    for (int j = 0; j < n; ++j) {//we traverse the n columns
      dfs(heights, 0, j, 0, seenP);//dfs method is called
      dfs(heights, m - 1, j, 0, seenA);//dfs method is called again
    }

    for (int i = 0; i < m; ++i)//we traverse the m rows
      for (int j = 0; j < n; ++j)// we traverse the n columns
        if (seenP[i][j] && seenA[i][j])//seenP matrix ith and jth element and seenA matrix ith and jth element if it is true then
          ans.add(new ArrayList<>(Arrays.asList(i, j)));//addans with new ArrayList

    return ans;//we return the ans
  }

  private void dfs(final int[][] heights, int i, int j, int h, boolean[][] seen) {
    if (i < 0 || i == heights.length || j < 0 || j == heights[0].length)//if i is less than 0 or i is equal to the length of heights or j is less than 0 or j is equal to heights array 1st element length
      return;//return 
    if (seen[i][j] || heights[i][j] < h)//if seen ith and jth element of matrix or  height ith and jth element of matrix is less than h then
      return;// return

    seen[i][j] = true;//else set ith and jth element of seen matrix to true
    dfs(heights, i + 1, j, heights[i][j], seen);//dfs method called
    dfs(heights, i - 1, j, heights[i][j], seen);//dfs method called
    dfs(heights, i, j + 1, heights[i][j], seen);//dfs method called
    dfs(heights, i, j - 1, heights[i][j], seen);//dfs method called
  }
}