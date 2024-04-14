class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);
            map.putIfAbsent(sortedString,new ArrayList<>());
            map.get(sortedString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
