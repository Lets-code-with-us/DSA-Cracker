class WordDictionary {
public:
    struct trieNode{
        bool isEndofWord;
        trieNode* children[26];
    };
    trieNode* getNode(){
        trieNode* newNode=new trieNode();
        newNode->isEndofWord=false;
        for(int i=0;i<26;i++){
            newNode->children[i]=NULL;
        }
        return newNode;
    }
    trieNode* root;
    WordDictionary() {
        root=getNode();
    }
    
    void addWord(string word) {
        trieNode* crawler=root;
        for(int i=0;i<word.length();i++){
            char ch=word[i];
            int idx=ch-'a';

            if(crawler->children[idx] == NULL){
                crawler->children[idx]=getNode();
            }
            crawler=crawler->children[idx];
        }
        crawler->isEndofWord=true;//last char
    }

    bool SearchAfterDot(trieNode* root,string word){
            trieNode* crawler=root;
        for(int i=0;i<word.length();i++){
            char ch=word[i];
            int idx=ch-'a';
            if(ch == '.'){
                for(int j=0;j<26;j++){
                    if(crawler->children[j] !=NULL){
                        if(SearchAfterDot(crawler->children[j],word.substr(i+1))==true){
                            return true;
                        }
                    }
                }
                return false;
            }
            else if (crawler->children[ch-'a'] == NULL){
                return false;
            }
            crawler=crawler->children[ch-'a'];
        }
        if(crawler != NULL && crawler->isEndofWord==true){
            return true;
        }
        return false;
    }
    
    bool search(string word) {
        return SearchAfterDot(root,word);
        
    }
};

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary* obj = new WordDictionary();
 * obj->addWord(word);
 * bool param_2 = obj->search(word);
 */