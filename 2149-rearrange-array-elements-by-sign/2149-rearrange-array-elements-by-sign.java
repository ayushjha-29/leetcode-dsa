class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] result = new int[nums.length];

        int pIdx = 0 , nIdx = 1;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > 0){
                result[pIdx] = nums[i];
                pIdx+=2;
            }else{
                result[nIdx] = nums[i];
                nIdx+=2;
            }
        }

        return result;
    }
}