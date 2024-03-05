class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allCombinations = new ArrayList<>();
        dfs(candidates, 0, target, new ArrayList<>(), allCombinations);
        return allCombinations;
    }

    private void dfs(int[] candidates, int index, int remainingTarget, List<Integer> currentList, List<List<Integer>> allCombinations) {
        if (remainingTarget == 0) {
            allCombinations.add(new ArrayList<>(currentList)); // Add a copy to avoid modification
            return;
        }

        if (remainingTarget < 0 || index >= candidates.length) {
            return; // Base cases: target exceeded or no more candidates
        }

        // Include the current candidate
        currentList.add(candidates[index]);
        dfs(candidates, index, remainingTarget - candidates[index], currentList, allCombinations);
        currentList.remove(currentList.size() - 1); // Backtrack (remove the added candidate)

        // Exclude the current candidate (try next candidates)
        dfs(candidates, index + 1, remainingTarget, currentList, allCombinations);
    }
}
