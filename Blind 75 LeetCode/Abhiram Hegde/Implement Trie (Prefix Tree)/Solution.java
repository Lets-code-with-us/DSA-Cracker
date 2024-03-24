class Trie {
    private TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode node=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node=node.children[index];
        }
        node.isEnd=true;
    }
    public boolean search(String word){
        TrieNode node = searchPrefix(word);
        return node !=null && node.isEnd;
    }
    public boolean startsWith(String prefix){
        return searchPrefix(prefix)!=null;
    }
    private TrieNode searchPrefix(String prefix){
        TrieNode node =root;
        for(char c:prefix.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                return null;
            }
            node=node.children[index];
        }
        return node;
    }
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        public TrieNode(){
            children=new TrieNode[26];
            isEnd=false;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
