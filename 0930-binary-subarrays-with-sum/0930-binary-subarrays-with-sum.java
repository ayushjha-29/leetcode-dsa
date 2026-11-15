class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int answer = 0;

        for(int i=0 ; i<nums.length ; i++){
            prefixSum+=nums[i];
            answer+=map.getOrDefault(prefixSum - goal , 0);
            map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
        }

        return answer;
    }
}