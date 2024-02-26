class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        def construct(current,wordDict, memo={}):
            if current in memo:
                return memo[current]

            if not current:
                return True

            for word in wordDict:
                if current.startswith(word):
                    new_current = current[len(word):]
                    if construct(new_current,wordDict,memo):
                        memo[current] = True
                        return True

            memo[current] = False
            return False

        return construct(s,wordDict)
