class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        int n = s.length();
        vector<bool> dp(n + 1, false);
        dp[n] = true;

        unordered_set<string> wordSet(wordDict.begin(), wordDict.end());

        for (int i = n - 1; i >= 0; i--) {
            for (string word : wordDict) {
                if (word.length() + i <= n && s.substr(i, word.length()) == word && dp[word.length() + i]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }
};
