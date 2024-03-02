class Solution {
    int bit(int n){
        int res=0;
        while(n!=0){
            res += n%2;
            n=n/2;
        }
        return res;
    }
public:
    vector<int> countBits(int n) {
        vector<int> resul;
        for(int i=0;i<=n;i++) resul.push_back(bit(i));
        return resul;
    }
};
