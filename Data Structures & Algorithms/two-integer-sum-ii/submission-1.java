class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int[] res=new int[2];
        int left=0,right=numbers.length-1;
        while(left<right){
            int currSum=numbers[left]+numbers[right];
            if(currSum>target){
                right--;
                continue;
            }
            else if(currSum<target){
                left++;
                continue;
            }
            else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[2];
    }
}
