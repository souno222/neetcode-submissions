class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> result=new HashMap<>();
        for(String s:strs){
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String sortedS=new String(charArr);
            result.putIfAbsent(sortedS,new ArrayList<>());
            result.get(sortedS).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
