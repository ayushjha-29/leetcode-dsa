class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        int n = nums.length;
        int [] result = new int[n];

        for(int i=0 ; i<n ; i++){
            result[i] = -1;
        }

        for(int i=0 ; i<2*n ; i++){
            int idx = i % n;

            while(!stack.isEmpty() && nums[stack.peek()] < nums[idx]){
                result[stack.peek()] = nums[idx];
                stack.pop();
            }

            stack.push(idx);
        }

        return result;
    }
}