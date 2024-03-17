class Solution
{
public:
    vector<string> result;
    vector<vector<int>> directions{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int m, n;
    struct trieNode
    {
        bool isEndofWord;
        string word;
        trieNode *children[26];
    };
    // create new node for us
    trieNode *getNode()
    {
        trieNode *newNode = new trieNode();
        newNode->isEndofWord = false;
        newNode->word = "";
        for (int i = 0; i < 26; i++)
        {
            newNode->children[i] = NULL;
        }
        return newNode;
    }
    // trieNode* root;
    // Trie() {
    //     root=getNode();
    // }

    void insert(trieNode *root, string &word)
    {
        trieNode *crawler = root;
        // check for each char. of word
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word[i];
            int idx = ch - 'a';

            if (crawler->children[idx] == NULL)
            {
                crawler->children[idx] = getNode();
            }
            crawler = crawler->children[idx];
        }
        crawler->isEndofWord = true; // last char
        crawler->word = word;
    }

    void search(vector<vector<char>> &board, int i, int j, trieNode *root)
    {
        if (i < 0 || i >= m || j < 0 || j >= n)
        {
            return;
        }
        if (board[i][j] == '$' || root->children[board[i][j] - 'a'] == NULL)
        {
            return;
        }

        root = root->children[board[i][j] - 'a'];

        if (root->isEndofWord == true)
        {
            result.push_back(root->word);
            root->isEndofWord = false;
        }

        char temp = board[i][j];
        board[i][j] = '$'; // marking visited

        // left,right,up,down
        for (vector<int> &dir : directions)
        {
            int new_i = i + dir[0];
            int new_j = j + dir[1];
            search(board, new_i, new_j, root);
        }
        board[i][j] = temp; // marking unvisited
    }
    vector<string> findWords(vector<vector<char>> &board, vector<string> &words)
    {
        m = board.size();    // row
        n = board[0].size(); // column
        // create root
        trieNode *root = getNode();

        // insert words in trie
        for (string &word : words)
        {
            insert(root, word);
        }
        // traverse the gird once and find all the words in trie if exist
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                char ch = board[i][j];

                if (root->children[ch - 'a'] != NULL)
                {
                    search(board, i, j, root);
                }
            }
        }
        return result;
    }
};