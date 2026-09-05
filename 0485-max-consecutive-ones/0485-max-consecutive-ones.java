class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currMax = 0 , max = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                currMax = 0;
            }else{
                currMax++;
                if(currMax > max){
                    max = currMax;
                }
            }
        }
        return max;
    }
}