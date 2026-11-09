class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int n = nums.length;

        for(int i=1 ; i<n ; i++){
            rightSum+=nums[i];
        }

        for(int i=0 ; i<n ; i++){

            if(leftSum == rightSum){
                return i;
            }

            leftSum+=nums[i];

            if(i != n-1){
                rightSum-=nums[i+1];
            }
        }

        return -1;
    }
}