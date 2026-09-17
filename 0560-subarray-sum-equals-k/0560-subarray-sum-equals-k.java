class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0 , count = 0;

        HashMap<Integer,Integer> prefixSum = new HashMap<>();

        prefixSum.put(0,1);

        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];

            int required = sum - k;

            if(prefixSum.containsKey(required)){
                count += prefixSum.get(required);
            }

            prefixSum.put(sum , prefixSum.getOrDefault(sum , 0) + 1);
        }

        return count;
    }
}