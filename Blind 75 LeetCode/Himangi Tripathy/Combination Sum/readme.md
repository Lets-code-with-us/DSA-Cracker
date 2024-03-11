class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
    List<List<Integer>> ans = new ArrayList<>();//we create a new arraylist of integer type
    Arrays.sort(candidates);//we sort the elements in candidates array
    dfs(0, candidates, target, new ArrayList<>(), ans);//we call the method
    return ans;//we return the ans 
  }

  private void dfs(int s, int[] candidates, int target, List<Integer> path,
                   List<List<Integer>> ans) {
    if (target < 0)//if target less than 0
      return;//then stop
    if (target == 0) {//if target =0 then
      ans.add(new ArrayList<>(path));//add new ArrayList of path to ans
      return;//then stop
    }

    for (int i = s; i < candidates.length; ++i) {//traversing candidates array
      path.add(candidates[i]);//add elements of candidates in path
      dfs(i, candidates, target - candidates[i], path, ans);//call the method again 
      path.remove(path.size() - 1);//remove path size from path
    }
  }
}
        
    