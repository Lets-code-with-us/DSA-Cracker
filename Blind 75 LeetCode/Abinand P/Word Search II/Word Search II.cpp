class TrieNode {
public:
    TrieNode* next[26];
    string word;

    TrieNode() {
        for (int i = 0; i < 26; i++) {
            next[i] = nullptr;
        }
    }
};

class Solution {
public:
    vector<string> findWords(vector<vector<char>>& board, vector<string>& words) {
        vector<string> res;
        TrieNode* root = buildTrie(words);
        int rows = board.size();
        int cols = board[0].size();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, root, res);
            }
        }
        return res;
    }

    void dfs(vector<vector<char>>& board, int i, int j, TrieNode* p, vector<string>& res) {
        char c = board[i][j];
        if (c == '#' || p->next[c - 'a'] == nullptr) return;
        p = p->next[c - 'a'];
        if (!p->word.empty()) {
            res.push_back(p->word);
            p->word = ""; // de-duplicate
        }

        board[i][j] = '#';
        int rows = board.size();
        int cols = board[0].size();
        if (i > 0) dfs(board, i - 1, j, p, res);
        if (j > 0) dfs(board, i, j - 1, p, res);
        if (i < rows - 1) dfs(board, i + 1, j, p, res);
        if (j < cols - 1) dfs(board, i, j + 1, p, res);
        board[i][j] = c;
    }

    TrieNode* buildTrie(vector<string>& words) {
        TrieNode* root = new TrieNode();
        for (const string& w : words) {
            TrieNode* p = root;
            for (char c : w) {
                int i = c - 'a';
                if (p->next[i] == nullptr) p->next[i] = new TrieNode();
                p = p->next[i];
            }
            p->word = w;
        }
        return root;
    }
};
