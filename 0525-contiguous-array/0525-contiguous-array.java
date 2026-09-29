class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        int length = 0 , maxLength = 0;

        int prefixSum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0 ; i<nums.length ; i++){
            prefixSum+=nums[i];

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }else{
                length = i - map.get(prefixSum);
            }

            maxLength = Math.max(maxLength , length);
        }

        return maxLength;
    }
}