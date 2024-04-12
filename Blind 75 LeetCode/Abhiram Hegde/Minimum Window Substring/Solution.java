class Solution{
    public String minWindow(String s,String t){
        if(s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> tFreq=new HashMap<>();
        for(char c:t.toCharArray()){
            tFreq.put(c,tFreq.getOrDefault(c,0)+1);
        }
        int required=tFreq.size();
        int left=0,right=0;
        int formed=0;
        Map<Character,Integer> windowFreq=new HashMap<>();
        int[] result={-1,0,0};
        while(right<s.length()){
            char c=s.charAt(right);
            windowFreq.put(c,windowFreq.getOrDefault(c,0)+1);            
            if(tFreq.containsKey(c) && windowFreq.get(c).intValue()==tFreq.get(c).intValue()){
                formed++;
            }
            while(left<=right && formed==required){
                if(result[0]==-1 || right-left+1<result[0]){
                    result[0]=right-left+1;
                    result[1]=left;
                    result[2]=right;
                }               
                char leftChar=s.charAt(left);
                windowFreq.put(leftChar,windowFreq.get(leftChar)-1);
                if(tFreq.containsKey(leftChar) && windowFreq.get(leftChar).intValue()<tFreq.get(leftChar).intValue()){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return result[0]==-1 ? "" : s.substring(result[1],result[2]+1);
    }
}
