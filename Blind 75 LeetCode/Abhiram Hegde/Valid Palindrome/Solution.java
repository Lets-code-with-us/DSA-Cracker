class Solution{
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char leftChar=toLowerCase(s.charAt(left));
            char rightChar=toLowerCase(s.charAt(right));
            while(left<right && !isAlphanumeric(leftChar)){
                left++;
                leftChar=toLowerCase(s.charAt(left));
            }
            while(left<right && !isAlphanumeric(rightChar)){
                right--;
                rightChar=toLowerCase(s.charAt(right));
            }
            if(leftChar!=rightChar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isAlphanumeric(char c){
        return (c>='a' && c<='z') || (c>='0' && c<='9');
    }
    private char toLowerCase(char c){
        return Character.toLowerCase(c);
    }
}
