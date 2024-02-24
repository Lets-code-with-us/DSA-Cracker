class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        len_text1, len_text2 = len(text1), len(text2)
        dp_matrix = [[0] * (len_text2 + 1) for _ in range(len_text1 + 1)]
      
        for i in range(1, len_text1 + 1):
            for j in range(1, len_text2 + 1):
                if text1[i - 1] == text2[j - 1]:
                    dp_matrix[i][j] = dp_matrix[i - 1][j - 1] + 1
                else:
                    dp_matrix[i][j] = max(dp_matrix[i - 1][j], dp_matrix[i][j - 1])
        return dp_matrix[len_text1][len_text2]