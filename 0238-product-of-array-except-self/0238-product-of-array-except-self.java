class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1 , n = nums.length;

        int [] answer = new int[n];

        for(int i=0 ; i<n ; i++){

            answer[i] = product;
            product *= nums[i];

        }

        product = 1;

        for(int i=n-1 ; i>=0 ; i--){

            answer[i] *= product;
            product *= nums[i];

        }

        return answer;
        
    }
}