class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int currMax = 0;
        int max = Integer.MIN_VALUE;
        int currMin = 0;
        int min = Integer.MAX_VALUE;
        int totalSum = 0;

        for(int i=0 ; i<n ; i++){
            totalSum+=nums[i];

            currMax = Math.max(currMax + nums[i] , nums[i]);
            max = Math.max(max , currMax);

            currMin = Math.min(currMin + nums[i] , nums[i]);
            min = Math.min(min , currMin);
        }

        if(max < 0){
            return max;
        }

        return Math.max(max , totalSum - min);
    }
}