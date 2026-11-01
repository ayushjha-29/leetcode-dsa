class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i=0 ; i<k ; i++){
            sum+=nums[i];
        }

        double maxAvg = (double)sum/k;

        for(int i=0,j=k ; j<nums.length ; i++,j++){
            sum = sum - nums[i] + nums[j];
            
            double avg = (double)sum/k;
            maxAvg = Math.max(avg,maxAvg);
        }

        return maxAvg;
    }
}