class Solution {
public:
//ye isliye bnaya he kyuki bar bar wordDict me search krne ke liye On complexity lgegi so set bna liya
    unordered_set<string>Dict;
    int t[301];
    /*break krna he string ko parts me and then check krna he ki vo wordDict me ha ya nhi pehle 1 char lene he fir 2 and so on
    check krte jana he and atlast return true if all words are found in Dict otherwise you know!*/
    int solve(int i,string s)
    {
        if(i == s.length()){return 1; }

        if(t[i]!=-1){return  t[i];}
        
        //temporary string craete kro apne break kiye hua words ko dekne ke liye
        string temp;
        
        //Hme i length  ka to word break krna he to thats why LengthOfWorkBreak=i
        for(int LengthOfWorkBreak=i;LengthOfWorkBreak<=s.length();LengthOfWorkBreak++){
            //Substring chaiye i se le kr LengthOfWorkBreak tak ki
            temp+=s[LengthOfWorkBreak];
            
            //if tuti hui string found ho jati he abhi age badhna he nhi to yahi se hi false age badhne ke liya sole ko call kr liya
            if(Dict.find(temp)!=Dict.end() && solve(LengthOfWorkBreak+1,s))
            { 
                return t[i]=1;
            }
        }
        //nhi kuch mita to false 
        return t[i]=0;
    }
    bool wordBreak(string s, vector<string>& wordDict) {
        memset(t,-1,sizeof(t));
        for(string &word:wordDict){
            Dict.insert(word);
        }
        return solve(0,s);
    }
};