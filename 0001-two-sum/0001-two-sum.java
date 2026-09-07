class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int [] result = new int[2];

        for(int i=0 ; i<nums.length ; i++){
            int needed = target - nums[i];

            if(map.containsKey(needed)){
                result[0] = map.get(needed);
                result[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }

        return result;
    }
}