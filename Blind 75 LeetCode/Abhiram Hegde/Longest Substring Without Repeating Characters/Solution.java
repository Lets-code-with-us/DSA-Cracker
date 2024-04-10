class Solution{
    public int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> charIndexMap = new HashMap<>();
        int start=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(charIndexMap.containsKey(ch) && charIndexMap.get(ch)>=start){
                start=charIndexMap.get(ch)+1;
            }
            maxLength=Math.max(maxLength,i-start+1);
            charIndexMap.put(ch,i);
        }
        return maxLength;
    }
}
