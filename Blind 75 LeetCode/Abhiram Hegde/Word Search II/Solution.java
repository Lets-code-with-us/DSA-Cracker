class Solution {
    public List<String> findWords(char[][] board, String[] words) {
         List<String> result = new ArrayList<>();
        TrieNode root = buildTrie(words);
        int m = board.length, n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                search(board, i, j, root, result);
            }
        }
        
        return result;
    }
    
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }
    
    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.word = word;
        }
        return root;
    }
    
    private void search(char[][] board, int i, int j, TrieNode node, List<String> result) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }
        char ch = board[i][j];
        if (ch == '$' || node.children[ch - 'a'] == null) {
            return;
        }
        
        node = node.children[ch - 'a'];
        if (node.word != null) {
            result.add(node.word);
            node.word = null;
        }
        
        board[i][j] = '$';
        search(board, i + 1, j, node, result);
        search(board, i - 1, j, node, result);
        search(board, i, j + 1, node, result);
        search(board, i, j - 1, node, result);
        board[i][j] = ch;
    }
}
