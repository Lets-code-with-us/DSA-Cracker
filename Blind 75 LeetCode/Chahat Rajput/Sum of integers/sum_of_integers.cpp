class Solution {
public:
    int getSum(int a, int b) {

        if (b==0){return a;}
        //jab same honge to 0 ayega jab different honge to 1
        int sum=a^b;
        //carry to find krne ke liye aur usko left shift krne ke liye use & operator
        int carry=(unsigned int) (a&b)<<1;
        //recursively call krte rhenge jab tak carry khatam na ho jaye
        return getSum(sum,carry);
    }
};