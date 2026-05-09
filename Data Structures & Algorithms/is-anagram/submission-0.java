class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> stringS = new HashMap<>();
        for(int i = 0; i< s.length() ; i++){
            char ch= s.charAt(i);
            stringS.put(ch,stringS.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!stringS.containsKey(t.charAt(i))|| stringS.getOrDefault(ch,0)==0){
                return false;
            }
            stringS.put(ch,stringS.get(ch)-1);
        }
        return true;
    }
}
