class Solution{
    public int characterReplacement(String s,int k){
        int n=s.length();
        int maxFreq=0;
        int left=0,right=0;
        int[] charCount=new int[26];
        while(right<n){
            charCount[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,charCount[s.charAt(right)-'A']);
            if(right-left+1-maxFreq>k){
                charCount[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return right-left;
    }
}
