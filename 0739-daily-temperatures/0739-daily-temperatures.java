class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }

        return result;
    }
}