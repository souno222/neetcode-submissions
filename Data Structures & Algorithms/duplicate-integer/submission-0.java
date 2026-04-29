class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> checkDuplicate = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(checkDuplicate.containsKey(nums[i])){
                return true;
            }else{
                checkDuplicate.put(nums[i],i);
            }
        }
        return false;
    }
}