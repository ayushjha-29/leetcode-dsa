class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = 0;

        for(int i=nums.length-1; i>=0; i--){
            if(i == 0){
                pivot = -1;
                break;
            }

            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }

        for(int i=nums.length-1; i>pivot ; i--){
            if(pivot == -1){
                break;
            }
            if(nums[i] > nums[pivot]){
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        for(int i=pivot != -1 ? pivot+1 : 0,j=nums.length-1; i<=j ; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}