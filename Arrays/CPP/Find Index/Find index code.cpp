class Solution
{
  public:
    vector<int> findIndex(int a[], int n, int key)
    {
        vector<int> vect(2,0);
        vect[0]=-1;
        vect[1]=-1;
        for(int i=0;i<n;i++){
            if(a[i]==key)  {
                if(vect[0]==-1){
                    vect[0]=i;
                }
                else{
                    vect[1] = i;
                }
            }
        }
        if(vect[1]==-1) vect[1]= vect[0];
        return vect;
    }
  
};
