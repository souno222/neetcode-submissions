class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> count = new HashSet<>();
        for(int num:nums){
            count.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!count.contains(num-1)){
                int length=0;
                while(count.contains(num+length)){
                    length++;
                    longest=Math.max(longest,length);
                }
            }
        }
        return longest;
    }
}
